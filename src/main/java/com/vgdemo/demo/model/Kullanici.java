package com.vgdemo.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "KULLANICI")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullanici_id;
    private String tc_no;
    private  String ad;
    private  String soyad;
    private  String e_mail;
    private String dogum_tarihi;
    private String fotograf;
   // private String sirket_id;

    @ManyToOne
    @JoinColumn(name = "sirket_id")
    private Sirket sirket;


    private String cinsiyet;
    private String uyruk;
    private String adres;
    private int baglanti_sayisi;
    private int takip_sayisi;
    private String hesap_turu;

}
