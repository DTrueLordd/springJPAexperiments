package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        System.out.println("UserService created");
    }


    //Селект *
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    //Сохранение в БД
    public User addUser(User user){
      return userRepository.save(user);
    }

}
