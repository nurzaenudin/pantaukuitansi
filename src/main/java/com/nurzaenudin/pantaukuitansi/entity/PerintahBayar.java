/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurzaenudin.pantaukuitansi.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author nurzaenudin
 */
@Entity
@JsonSerialize
public class PerintahBayar {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private Long nomorperintahbayar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNomorperintahbayar() {
        return nomorperintahbayar;
    }

    public void setNomorperintahbayar(Long nomorperintahbayar) {
        this.nomorperintahbayar = nomorperintahbayar;
    }
    
    
    
    
}
