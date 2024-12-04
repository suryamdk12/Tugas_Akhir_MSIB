package com.example.projek_akhir;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Prediksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaSaham;
    private Date tanggalPrediksi;
    private double hargaPrediksi

    public Prediksi(double hargaPrediksi) {
        this.hargaPrediksi = hargaPrediksi;
    }
    //getter setter

}

public class SejarahSaham{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaSaham;
    private Date tanggal;
    private double hargaBuka;
    private double hargaTutup;

}

@Entity
public class Pengguna{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

}