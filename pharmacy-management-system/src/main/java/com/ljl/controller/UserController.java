package com.ljl.controller;

import com.ljl.pojo.Result;
import com.ljl.pojo.medicine;
import com.ljl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins = "http://localhost:7000")
@RequestMapping("/depts")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    //查询
    public Result list(){
        List<medicine> medicineList=userService.list();
      return Result.success(medicineList);
    }
    @DeleteMapping("{id}")
    //删除
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }
    @PostMapping
    //添加
    public Result add(@RequestBody medicine medicine){
        userService.add(medicine);
        return Result.success();
    }

}
