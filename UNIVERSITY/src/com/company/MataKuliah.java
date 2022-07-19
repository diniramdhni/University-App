package com.company;

import com.sun.tools.javac.Main;

import java.time.LocalDate;

public class MataKuliah {
    protected String namaMatkul;
    protected String namaPenjurusan;
    protected int poin;

    public MataKuliah(){}
    public MataKuliah(String namaMatkul, String namaPenjurusan, int poin){
        this.namaMatkul = namaMatkul;
        this.namaPenjurusan = namaPenjurusan;
        this.poin = poin;
    }
    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }
    public void setNamaPenjurusan(String namaPenjurusan){
        this.namaPenjurusan = namaPenjurusan;
    }
    public void setPoin(int poin){
        this.poin = poin;
    }

    public String getNamaMatkul(){
        return this.namaMatkul;
    }
    public String getNamaPenjurusan(){
        return this.namaPenjurusan;
    }
    public int getPoin(){
        return this.poin;
    }


}
