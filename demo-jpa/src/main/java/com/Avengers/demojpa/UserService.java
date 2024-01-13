package com.Avengers.demojpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {
    @Autowired
    Repository repository;

    public String addUser(Users user)
    {
      repository.save(user);
      return "user added";
    }

    public List<Users> getUsers()
    {
      return repository.findAll();
    }
    public Users getUser(int rollno)
    {
       return repository.findById(rollno).get();
    }
    public String deleteUser(int rollno)
    {
        repository.deleteById(rollno);
        return "user deleted";
    }
    public String deleteAllUsers()
    {
        repository.deleteAll();
        return " All user deleted";
    }
//    public String updateUser(int rollno)
//    {
//        repository.
//        return "user deleted";
//    }
}
