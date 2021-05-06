package com.naera.second.service;

import com.naera.second.model.Role;
import com.naera.second.model.User;
import com.naera.second.repository.RoleRepository;
import com.naera.second.repository.UserRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
   private UserRepository userRepository;
//    @Autowired
   private RoleRepository roleRepository;
//    @Autowired
   private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActivation(true);
      Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    ////    private static final Map<Integer, User> USER_MAP = new HashMap<>();
////
////    private static final AtomicInteger USER_ID_HOLDER = new AtomicInteger();
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public void create(User user) {
////        final int userId = USER_ID_HOLDER.incrementAndGet();
////        user.setId(userId);
////        USER_MAP.put(userId, user);
//        userRepository.save(user);
//    }
//
//    @Override
//    public List<User> readAll() {
//
//        //       return new ArrayList<>(USER_MAP.values());
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User read(int id) {
//
////        return USER_MAP.get(id);
//        return userRepository.getOne(id);
//    }
//
//    @Override
//    public boolean update(User user, int id) {
////        if (USER_MAP.containsKey(id)) {
////            user.setId(id);
////            USER_MAP.put(id, user);
////            return true;
////        }
//        if (userRepository.existsById(id)) {
//            user.setId(id);
//            userRepository.save(user);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean delete(int id) {
//
////        return USER_MAP.remove(id) != null;
//        if (userRepository.existsById(id)) {
//            userRepository.deleteById(id);
//            return true;
//        }
//        return false;
//    }

}
