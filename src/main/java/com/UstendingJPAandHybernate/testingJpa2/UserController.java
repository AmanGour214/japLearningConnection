package com.UstendingJPAandHybernate.testingJpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String creatUser (@RequestBody User user){

        return userService.addUaser(user);

    }

    @GetMapping("/get_user/{id}")
    public User findById(@PathVariable("id") int id){
        return userService.findById(id);
    }
    @GetMapping("/getAll_user")

    public List<User> findAllUser (){
        return userService.findAllUser();
    }


}
