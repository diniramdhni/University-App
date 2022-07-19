package com.company;

import ListEnum.Agama;
import ListEnum.Gender;
import ListEnum.Goldar;

import java.time.LocalDate;

public abstract class Person {
    protected String nik;
    protected String namaDepan;
    protected String namaBelakang;
    protected LocalDate tglLahir;
    protected String kotaLahir;
    protected long nomorKTP;
    protected Agama agama;
    protected Goldar goldar;
    protected Gender gender;



    public Person(String nik, String namaDepan, String namaBelakang, String namaBelakang1, LocalDate tglLahir, String kotaLahir,
                  long nomorKTP, Agama agama, Goldar goldar, Gender gender) {
        this.nik = nik;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tglLahir = tglLahir;
        this.kotaLahir = kotaLahir;
        this.nomorKTP = nomorKTP;
        this.agama = agama;
        this.goldar = goldar;
        this.gender = gender;

    }

    public Person() {}

    public void setNik(String nik){
            this.nik = nik;
    }
    public void setNamaDepan(String namaDepan){
        this.namaDepan = namaDepan;
    }
    public void setNamaBelakang(String namaBelakang){
        this.namaBelakang = namaBelakang;
    }
    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir = tglLahir;
    }
    public void setKotaLahir(String kotaLahir){
        this.kotaLahir = kotaLahir;
    }
    public void setNomorKTP(long nomorKTP){
        this.nomorKTP = nomorKTP;
    }
    public void setAgama(Agama agama){
        this.agama = agama;
    }
    public void setGoldar(Goldar goldar){
        this.goldar = goldar;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }

    public String getNik(){
        return this.nik;
    }
    public String getNamaDepan(){
        return  this.namaDepan;
    }
    public String getNamaBelakang(){
        return this.namaBelakang;
    }
    public LocalDate getTglLahir(){
        return this.tglLahir;
    }
    public String getKotaLahir(){
        return this.kotaLahir;
    }
    public long getNomorKTP(){
        return this.nomorKTP;
    }
    public Agama getAgama(){
        return this.agama;
    }
    public Goldar goldar(){
        return this.goldar;
    }
    public Gender gender(){
        return this.gender;
    }
}


