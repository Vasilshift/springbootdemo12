package web.service;

import org.hibernate.Session;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import web.model.Role;
import web.model.User;
import web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    private EntityManager entityManager;

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {

//        TypedQuery<User> query = entityManager.createQuery("From User where username=:username", User.class);
//        query.setParameter("username", username);
//        return query.getResultList().stream().findAny().orElse(null);

        return userRepository.findByUsername(username);

    }

//    public String getRoleByRolename(String rolename) {
//        return rolename;
//    }

    public User addRoleToUser(User user, Role role) {
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);
        return user;
    }


    public Role getRoleByRolename(String rolename) {
        return entityManager.createQuery("select r from Role r where r.rolename = :username", Role.class)
                .setParameter("username", rolename)
                .getSingleResult();
    }





//    @Transactional
//    //@Override
//    public void setupRoles(User user, String roleAdmin, String roleUser) {
//        Set<Role> roles = new HashSet<>();
//
//        if (roleAdmin.equals("ROLE_ADMIN")) {
//            roles.add();
//        }
//        if (roleUser.equals("ROLE_USER")) {
//            roles.add(getRoleByRolename("ROLE_USER"));
//        }
//        user.setRoles(roles);
//
//        System.out.println(user.getRoles());
//    }
}
