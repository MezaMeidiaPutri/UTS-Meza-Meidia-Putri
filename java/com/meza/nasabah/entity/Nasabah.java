/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meza.nasabah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Nasabah {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long peminjamanId;
    private Long nasabahId;
    private Long jumlahPinjaman;
    private Long lamaPinjaman;
    private Long bungaPinjaman;
    private Long angsuranpokok;
    private Long angsuranbln;
    private Long totalutang;

    
}