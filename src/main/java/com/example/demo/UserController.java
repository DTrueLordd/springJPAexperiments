package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//контроллер, возвращающий json/xml данные
//обычный контроллер возвращает представления (html страницы)
@RestController





// указание пути, по которому будут обрабатываться запросы
// @RequestMapping(/api/users)


//дефолт, запросы обрабатываются по localhost:8080
@RequestMapping

public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService , UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    // ГЕТ запрос выводящий всех юзеров на localhost:8080
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }



    //ПОСТ запрос на localhost:8080


    // curl -X POST http://localhost:8080 -H "Content-Type: application/json" -d "{\"name\": \"John Doe\"}"
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }


    @PostMapping("/submit") // Привязка данных к объекту модели (энтити)
    public String handleSubmit(@ModelAttribute User user)  {
        // Сохраняем пользователя в базе данных
         userService.addUser(user);
        return "Successfuly submitted your data";
    }

}

