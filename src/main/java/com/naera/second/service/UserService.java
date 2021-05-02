package com.naera.second.service;

import com.naera.second.model.User;

public interface UserService {
    void saveUser(User user);

    void findUserByEmail(String email);


//    List<User> readAll();
//
//    User read(int id);
//
//    boolean update(User user, int id);
//
//    boolean delete(int id);


}


//package com.naera.second.service;

//import com.naera.second.model.User;
//import com.naera.second.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    UserRepository<User> userUserRepository;
//
//    @Transactional
//    public List<User> getAllUser() {
//        return (List<User>) userUserRepository.findAll();
//    }
//
//    @Transactional
//    public List<User> findByName(String name) {
//        return userUserRepository.findByFirstName(name);
//    }
//
//    @Transactional
//    public Optional<User> getById(Integer id) {
//        return userUserRepository.findById(id);
//    }
//
//    @Transactional
//    public void deleteUser(Integer userId) {
//        userUserRepository.deleteById(userId);
//    }
//
//    @Transactional
//    public boolean addUser(User user) {
//        return userUserRepository.save(user) != null;
//    }
//
//    @Transactional
//    public boolean updateUser(User user) {
//        return userUserRepository.save(user) != null;
//    }
//}
