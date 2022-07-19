package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class University {
    private static String namaUniv;
    private static LocalDate tglBerdiri;
    private String alamat;

    public University(){}
    public University(String alamat){
        this.alamat =alamat;
    }

    public static void setNamaUniv(String namaUniv){
        University.namaUniv = namaUniv;
    }
    public static void setTglBerdiri(LocalDate tglBerdiri){
        University.tglBerdiri = tglBerdiri;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public static String getNamaUniv(){
       return University.getNamaUniv();
    }
    public static LocalDate getTglBerdiri(){
        return University.getTglBerdiri();
    }
    public String getAlamat(){
        return this.alamat;
    }

    public void AboutThisUniversity(){
        Locale indonesia = new Locale("id", "ID");
        DateTimeFormatter indofromat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
        System.out.println(String.format("Universitas ini bernama %s. Sudah didirikan sejak %s di %s", University.namaUniv,
                indofromat.format(University.tglBerdiri), this.alamat));
    }
}
