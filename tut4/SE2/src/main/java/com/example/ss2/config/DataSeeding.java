//package com.example.ss2.config;
//
//import com.example.ss2.model.Role;
//import com.example.ss2.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import com.example.ss2.repository.RoleRepository;
//import com.example.ss2.repository.UserRepository;
//
//import javax.transaction.Transactional;
//import java.util.HashSet;
//
//@Component
//@Transactional
//public class DataSeeding implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//
//        Role adminRole = new Role("ROLE_ADMIN");
//        Role memberRole = new Role("ROLE_MEMBER");
////        System.out.println(roleRepository.findByName("ROLE_ADMIN"));
////        if (roleRepository.findByName("ROLE_ADMIN") == null) {
////            roleRepository.save(adminRole);
////        }
////
////        if (roleRepository.findByName("ROLE_MEMBER") == null) {
////            roleRepository.save(memberRole);
////        }
//
//        // Admin account
//        if (userRepository.findByUsername("admin") == null) {
//            User admin = new User();
//            admin.setUsername("admin");
//            admin.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(adminRole);
//            roles.add(memberRole);
//            admin.setRoles(roles);
//            System.out.println("HERE");
//            userRepository.save(admin);
//
//        }
//
//        // Member account
//        if (userRepository.findByUsername("member") == null) {
//            User user = new User();
//            user.setUsername("member");
//            user.setPassword(passwordEncoder.encode("123456"));
//            HashSet<Role> roles = new HashSet<>();
//            roles.add(memberRole);
//            user.setRoles(roles);
//            userRepository.save(user);
//        }
//    }
//}
