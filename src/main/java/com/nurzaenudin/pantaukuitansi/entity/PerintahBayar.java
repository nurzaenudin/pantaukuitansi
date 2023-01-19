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
    
    private Long nomorPerintahBayar;
    
    private Long nilaiKotor;
    
    private Long jumlah;
    
    private Long hargaSatuan;
    
    private Long ppn;
    
    private Long pph21;
    
    private Long pph22;
    
    private Long pph23;
    
    private Long pphFinal;
    
    private Long totalPajak;
    
    private Long nilaiBersih;
    
    private Long nomorDrpp;
    
    private Long namaRekanan;
    
    private Long nomorKuitansi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNomorPerintahBayar() {
        return nomorPerintahBayar;
    }

    public void setNomorPerintahBayar(Long nomorPerintahBayar) {
        this.nomorPerintahBayar = nomorPerintahBayar;
    }

    public Long getNilaiKotor() {
        return nilaiKotor;
    }

    public void setNilaiKotor(Long nilaiKotor) {
        this.nilaiKotor = nilaiKotor;
    }


    public Long getJumlah() {
        return jumlah;
    }

    public void setJumlah(Long jumlah) {
        this.jumlah = jumlah;
    }

    public Long getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(Long hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public Long getPpn() {
        return ppn;
    }

    public void setPpn(Long ppn) {
        this.ppn = ppn;
    }

    public Long getPph21() {
        return pph21;
    }

    public void setPph21(Long pph21) {
        this.pph21 = pph21;
    }

    public Long getPph22() {
        return pph22;
    }

    public void setPph22(Long pph22) {
        this.pph22 = pph22;
    }

    public Long getPph23() {
        return pph23;
    }

    public void setPph23(Long pph23) {
        this.pph23 = pph23;
    }

    public Long getPphFinal() {
        return pphFinal;
    }

    public void setPphFinal(Long pphFinal) {
        this.pphFinal = pphFinal;
    }

    public Long getTotalPajak() {
        return totalPajak;
    }

    public void setTotalPajak(Long totalPajak) {
        this.totalPajak = totalPajak;
    }

    public Long getNilaiBersih() {
        return nilaiBersih;
    }

    public void setNilaiBersih(Long nilaiBersih) {
        this.nilaiBersih = nilaiBersih;
    }
    
    
    public Long getNomorDrpp() {
        return nomorDrpp;
    }

    public void setNomorDrpp(Long nomorDrpp) {
        this.nomorDrpp = nomorDrpp;
    }

    public Long getNamaRekanan() {
        return namaRekanan;
    }

    public void setNamaRekanan(Long namaRekanan) {
        this.namaRekanan = namaRekanan;
    }
    
    
    public Long getNomorKuitansi() {
        return nomorKuitansi;
    }

    public void setNomorKuitansi(Long nomorKuitansi) {
        this.nomorKuitansi = nomorKuitansi;
    }
   
    
    
}
