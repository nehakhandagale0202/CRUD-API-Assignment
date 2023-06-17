package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.student;
import com.example.demo.service.studService;

@Controller
public class studentController {
    
    @Autowired
    private studService studServiceObj;
    
    @PostMapping("AddOrUpdate")
    public ResponseEntity<student> AddOrUpdate(@RequestBody student cust){
        student cust2 = null;
         try{
            cust2=studServiceObj.AddORUpdate(cust);
         }catch(Exception ex){
            ex.getMessage();
         }
        return new ResponseEntity<student>(cust2, HttpStatus.OK);
    }

    @GetMapping("allCustomer")
    public ResponseEntity<List<student>> getAll(){
        List<student> stud=null;
        try{
            stud=studServiceObj.getAll();
        }catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<student>>(stud,HttpStatus.OK);
    }


    @GetMapping("getById/{id}")
    public ResponseEntity<student> getById(@PathVariable("id")int id){
        student stud = null;
        try{
            stud=studServiceObj.getById(id);
        }catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<student>(stud, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<student> delete(@PathVariable("id") int id)
    {
        student stud=null;
        try{
            stud=studServiceObj.delete(id);
        }catch(Exception ex)
        {
            ex.getMessage();
        }
        return new ResponseEntity<student>(stud, HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<student> update(@PathVariable("id")int id, @RequestBody student myResource)
    {
        student stud=null;
        try{
            stud=studServiceObj.update(id, myResource);
        }catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<student>(stud,HttpStatus.OK);
    }
}
