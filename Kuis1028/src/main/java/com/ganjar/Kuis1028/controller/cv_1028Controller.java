/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.controller;
import com.ganjar.Kuis1028.entity.cv_1028;
import com.ganjar.Kuis1028.service.cv_1028Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC320-10
 */
@RestController
@RequestMapping("/cv_1028")
public class cv_1028Controller {
    @Autowired
    private cv_1028Service cv_1028Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public cv_1028 insert(@RequestBody cv_1028 cv_1028){
        return cv_1028Service.insert(cv_1028);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public cv_1028 update(@RequestBody cv_1028 category) {
        return cv_1028Service.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1028Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1028 getById(@PathVariable("id") Long id){
        return cv_1028Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1028> getAll(){
        return cv_1028Service.getAll();
    }
}
