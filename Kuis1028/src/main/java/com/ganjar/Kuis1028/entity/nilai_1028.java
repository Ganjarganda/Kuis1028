/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganjar.Kuis1028.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author PC320-10
 */
@Entity
@Table(name = "nilai_1028")
public class nilai_1028  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String mata_kuliah;
    private double nilai;
    @ManyToOne
    private cv_1028 mcv_1028;
    
    public Long getId_Nilai(){
        return id;
    }
    public void setID_Nilai(Long id_nilai){
        this.id = id_nilai;
    }
    public String getMataKuliah(){
        return mata_kuliah;
    }
    public void setMataKuliah(String mata_kuliah){
        this.mata_kuliah = mata_kuliah;
    }
    public double getNilai(){
        return nilai;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
    public cv_1028 getCv(){
        return mcv_1028;
    }
    public void setCv(cv_1028 ncv1028){
        this.mcv_1028 = ncv1028;
    }
}
