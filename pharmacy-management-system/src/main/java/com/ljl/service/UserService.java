package com.ljl.service;

import com.ljl.pojo.medicine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
     List<medicine> list();

     void delete(Integer id);

     void add(medicine medicine);

}
