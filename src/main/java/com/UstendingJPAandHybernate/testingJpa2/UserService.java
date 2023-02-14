package com.UstendingJPAandHybernate.testingJpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //
    UserRepository userRepository;// this makes the object to JpaRepository class since we extent jap,

    public  String addUaser(User user){
        userRepository.save(user);
        return "Usear Added Sucessfully";
    }
    public User findById(int id){

        User user=userRepository.findById(id).get();
        return user;
     }
     public List<User> findAllUser(){
        List<User>Alluser=userRepository.findAll();
        return Alluser;
     }




}
