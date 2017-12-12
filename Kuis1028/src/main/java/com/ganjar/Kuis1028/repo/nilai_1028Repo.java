/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.repo;
import com.ganjar.Kuis1028.entity.nilai_1028;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author PC320-10
 */
public interface nilai_1028Repo extends CrudRepository<nilai_1028, Long> {
    @Query("Select n from nilai_1028 n")
    public List<nilai_1028> findAllNilai();
    
    //@Query("Select n from nilai_1028 n where n.cv_1028.id= :id")
    //public List<nilai_1028> findByCV(@Param("id") Long id);
}
