/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.repo;
import com.ganjar.Kuis1028.entity.cv_1028;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC320-10
 */
public interface cv_1028Repo extends CrudRepository<cv_1028, Long>{
    @Query("select c from cv_1028 c")
    public List<cv_1028> findAllCV();
}
