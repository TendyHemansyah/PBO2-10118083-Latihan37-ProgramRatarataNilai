/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan37.programrataratanilai;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Program Rata-Rata Nilai
 */
public class Mahasiswa {
    
    private double nilai;
    private int JumlahMahasiswa;
    
    public void setNilai(double nilai){
        this.nilai = this.nilai + nilai;
    }

    public int getJumlahMahasiswa() {
        return JumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int JumlahMahasiswa) {
        this.JumlahMahasiswa = JumlahMahasiswa;
    }
    
    public double hitungRataRata(){
        return nilai / JumlahMahasiswa;
    }
    
}
