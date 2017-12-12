/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.controller;
import com.ganjar.Kuis1028.entity.nilai_1028;
import com.ganjar.Kuis1028.repo.nilai_1028Repo;
import com.ganjar.Kuis1028.service.nilai_1028Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC320-10
 */
@RestController
@RequestMapping("/nilai_1028")
public class nilai_1028Controller {
    @Autowired
    private nilai_1028Service nilai_1028Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai_1028 insertOrUpdate(@RequestBody nilai_1028 nilai_1028){
        return nilai_1028Service.insertOrUpdate(nilai_1028);
    }
}
