package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.student;

public interface studrepo extends CrudRepository<student,Integer>{
    
}
