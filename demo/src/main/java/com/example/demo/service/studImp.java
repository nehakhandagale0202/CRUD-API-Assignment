package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studrepo;

@Service
public class studImp implements studService{
    
    @Autowired
    private studrepo cRepo;

    @Override
    public student AddORUpdate(student cust) {
        return cRepo.save(cust);
    }

    @Override
    public List<student> getAll() {
       return (List<student>) cRepo.findAll();
    }

    @Override
    public student getById(int id) {
        return cRepo.findById(id).orElse(null);
    }

    @Override
    public student delete(int id) throws Exception
    {
        student deletedC=null;
        try{
            deletedC=cRepo.findById(id).orElse(null);
            if(deletedC==null){
                throw new Exception("Customer not available");
            }else{
                cRepo.deleteById(id);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
        return deletedC ;
    }

    @Override
    public student update(int id, student myResource) throws Exception{        
      
       student updateC=cRepo.findById(id).orElse(null);
       try{
        if(updateC == null){
            throw new Exception("user not available");
        }else{
            updateC.setStudent_fname(myResource.getStudent_fname());
            updateC.setStudent_lname(myResource.getStudent_lname());
            updateC.setStudent_email(myResource.getStudent_email());
            updateC.setStudent_mob(myResource.getStudent_mob());
            updateC.setStudent_city(myResource.getStudent_city());

            // System.out.println("chetan" + myResource.getName());

            updateC = cRepo.save(updateC);
            return updateC;
        }
       }catch(Exception ex){
        System.out.println(ex.getMessage());
        throw ex;
       }        
    //    return updateEmp;
    }
}
