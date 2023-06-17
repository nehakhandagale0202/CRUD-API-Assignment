package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.student;

public interface studService {
    
    public student AddORUpdate(student cust);

    public List<student> getAll();

    public student getById(int id);

    public student delete(int id) throws Exception;

    public student update(int id, student myResource) throws Exception;
}
