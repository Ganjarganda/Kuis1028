/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.service;
import com.ganjar.Kuis1028.entity.cv_1028;
import com.ganjar.Kuis1028.repo.cv_1028Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC320-10
 */
@Service("cv_1028Service")
@Transactional
public class cv_1028Service {
    @Autowired
    private cv_1028Repo repo;
    
    public cv_1028 insert(cv_1028 cv){
        return repo.save(cv);
    }
    public cv_1028 update(cv_1028 cv){
        return repo.save(cv);
    }
     public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1028 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1028> getAll(){
        return repo.findAllCV();
    }
}
