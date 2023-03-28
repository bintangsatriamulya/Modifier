/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materi_tugas_2;

/**
 *
 * @author Bintang Satria Mulya
 */
public class Main {
    public static void main(String[] args) {
        
    Modifier main=new Modifier();
    
    main.name="Nahida Kusanali";
    main.nickname="Nahida";
    main.setUmur(500);
    main.setTtl(27);
    main.setAlamat("Sumeru Akademia");
    
    System.out.println("");
    System.out.println("==---BIO DATA---==");
    System.out.println("Name : "+main.name);
    System.out.println("Nama Panggilan : "+main.nickname);
    System.out.println("Umur : "+main.getUmur()+" Tahun");
    System.out.println("Tanggal Lahir : "+main.geTtl()+" Oktober");
    System.out.println("Alamat Rumah  : "+main.getAlamat());
    } 
}
