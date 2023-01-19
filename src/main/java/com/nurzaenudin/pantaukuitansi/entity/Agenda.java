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
public class Agenda {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String namaBiro;
    
    private String namaPPK;
    
    private Long nilaiKotor;
    
    private Long nilaiPajak;
    
    private Long nilaiBersih;
    
    private String tanggalBayar;
    
    private Long nomorDrpp;
    
    private Long nomorSpp;
    
    private String status;
    
    private String cekFisik;
    
    private String keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaBiro() {
        return namaBiro;
    }

    public void setNamaBiro(String namaBiro) {
        this.namaBiro = namaBiro;
    }

    public String getNamaPPK() {
        return namaPPK;
    }

    public void setNamaPPK(String namaPPK) {
        this.namaPPK = namaPPK;
    }

    public Long getNilaiKotor() {
        return nilaiKotor;
    }

    public void setNilaiKotor(Long nilaiKotor) {
        this.nilaiKotor = nilaiKotor;
    }

    public Long getNilaiPajak() {
        return nilaiPajak;
    }

    public void setNilaiPajak(Long nilaiPajak) {
        this.nilaiPajak = nilaiPajak;
    }

    public Long getNilaiBersih() {
        return nilaiBersih;
    }

    public void setNilaiBersih(Long nilaiBersih) {
        this.nilaiBersih = nilaiBersih;
    }

    public String getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(String tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    public Long getNomorDrpp() {
        return nomorDrpp;
    }

    public void setNomorDrpp(Long nomorDrpp) {
        this.nomorDrpp = nomorDrpp;
    }

    public Long getNomorSpp() {
        return nomorSpp;
    }

    public void setNomorSpp(Long nomorSpp) {
        this.nomorSpp = nomorSpp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCekFisik() {
        return cekFisik;
    }

    public void setCekFisik(String cekFisik) {
        this.cekFisik = cekFisik;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
    
   
    
}
