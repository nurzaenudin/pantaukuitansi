/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nurzaenudin.pantaukuitansi.dao;

import com.nurzaenudin.pantaukuitansi.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nurzaenudin
 */

@Repository
public interface AgendaDao extends JpaRepository<Agenda, Long>{
    
}
