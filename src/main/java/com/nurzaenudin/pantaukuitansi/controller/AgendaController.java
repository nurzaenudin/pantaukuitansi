/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurzaenudin.pantaukuitansi.controller;

import com.nurzaenudin.pantaukuitansi.dao.AgendaDao;
import com.nurzaenudin.pantaukuitansi.entity.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nurzaenudin
 */

@Controller
public class AgendaController {
    @Autowired
    private AgendaDao agendadao;
    
    @GetMapping ("/agenda/home")
    @ResponseBody
    public String home(){
        return "ini home agenda";
    }
    
    @GetMapping("agenda/all")
    @ResponseBody
    public Page<Agenda> getAllAgendas (Pageable pageable){
        return agendadao.findAll(pageable);
    }
    
    @PostMapping(path="/agenda/tambah")
    @ResponseBody
    public void tambahAgenda (@RequestBody Agenda agenda){
        agendadao.save(agenda);
    }
    
    
    
}
