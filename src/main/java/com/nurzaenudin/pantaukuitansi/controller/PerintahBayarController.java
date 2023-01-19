/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurzaenudin.pantaukuitansi.controller;

import com.nurzaenudin.pantaukuitansi.dao.PerintahBayarDao;
import com.nurzaenudin.pantaukuitansi.entity.PerintahBayar;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nurzaenudin
 */

@Controller
public class PerintahBayarController {
    @Autowired
    private PerintahBayarDao perintahbayardao;
    
    @GetMapping ("/perintahbayar/home")
    @ResponseBody
    public String home(){
        return "ini home";
    }
    
    @GetMapping("perintahbayar/all")
    @ResponseBody
    public Page<PerintahBayar> getAllPerintahBayars(Pageable pageable){
        return perintahbayardao.findAll(pageable);
    }
    
    @PostMapping(path="/perintahbayar/tambah")
    @ResponseBody
    public void tambahPerintahBayar(@RequestBody PerintahBayar perintahbayar){
        perintahbayardao.save(perintahbayar);
    }
    
    @DeleteMapping("/perintahbayar/{id}")
    @ResponseBody
    public String hapusPerintahBayar (@PathVariable Long id){
        perintahbayardao.deleteById(id);
        return "Hapus Berhasil";
    }
    
    @GetMapping("/perintahbayar/{id}")
    @ResponseBody
    public Optional getPerintahBayar(@PathVariable Long id){
        System.out.println("ini adalah id " +id);
        return perintahbayardao.findById(id);
    }
    
    
    @PutMapping("/perintahbayar/{id}")
    @ResponseBody
    public void updatePerintahBayar (@RequestBody PerintahBayar perintahbayar, @PathVariable Long id){
        Optional <PerintahBayar> pb= getPerintahBayar(id);
        if (!pb.isPresent())
            return;
        perintahbayar.setId(id);
        perintahbayardao.save(perintahbayar);
        System.out.println("berhasil simpan " + perintahbayar);
        
        
        
    }
    
}
