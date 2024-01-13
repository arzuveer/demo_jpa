package com.Avengers.demojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;
    @PostMapping("/add")
    public String addUser(@RequestBody Users user){

       return service.addUser(user);
    }
    @GetMapping("/get_users")
    public List<Users> getUsers()
    {
        return service.getUsers();
    }
    @GetMapping("/get_user")
    public Users getUser(@RequestParam("rollno") int rollno)
    {
      return  service.getUser(rollno);
    }
    @DeleteMapping("/delete_user")
    public String deleteUser(@RequestParam("rollno") int rollno)
    {
        return service.deleteUser(rollno);
    }
    @DeleteMapping("/delete_Allusers")
    public String deleteAllUsers()
    {
       return service.deleteAllUsers();
    }
//    @PutMapping("/update_user")
//    public String updateUser(@RequestParam("rollno") int rollno)
//    {
//        return service.updateUser(rollno);
//    }
}

