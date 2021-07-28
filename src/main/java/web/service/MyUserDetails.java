//package web.service;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import web.model.Role;
//import web.model.User;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class MyUserDetails implements UserDetails {
//
//    private final String username;
//    private final String password;
//    //private boolean active;
//    //private List<GrantedAuthority> authorities;
//
//    public MyUserDetails(User user) {
//        this.username = user.getUsername();
//        this.password = user.getPassword();
//        //this.active = user.isActive();
//        //this.authorities = user.getRoles()
//        //        .stream().map((Role role) -> new SimpleGrantedAuthority("ROLE_USER"))
//        //        .collect(Collectors.toList());
//    }
//
//    //public MyUserDetails() {}
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//        //return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return "pass";
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//
//}
