/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.service;
import com.ganjar.Kuis1028.entity.nilai_1028;
import com.ganjar.Kuis1028.repo.nilai_1028Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC320-10
 */
@Service("nilai_1028Service")
@Transactional
public class nilai_1028Service {
    @Autowired
    public nilai_1028Repo repo;
    
    public nilai_1028 insertOrUpdate(nilai_1028 x){
        return repo.save(x);
    }
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    public List<nilai_1028> findAll(){
        return repo.findAllNilai();
    }
    //public List<nilai_1028> findByCategory(Long nilai_id){
       // return repo.findByCV(nilai_id);
    //}
}
