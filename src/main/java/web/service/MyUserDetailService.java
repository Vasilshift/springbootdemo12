//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import web.model.User;
//import web.repository.UserRepository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.Optional;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//
////    @PersistenceContext
////    private EntityManager entityManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
////        TypedQuery<User> query = entityManager.createQuery("From User where username=:username", User.class);
////        query.setParameter("username", username);
////        return query.getResultList().stream().findAny().orElse(null);
//
//        Optional<User> user = userRepository.findByUsername(username);
//        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
//        return user.map(MyUserDetails::new).get();
//
//        //return new MyUserDetails(user);
//
//    }
//
//}
