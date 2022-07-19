package com.company;

import ListEnum.Agama;
import ListEnum.Gender;
import ListEnum.Goldar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Mahasiswa extends Person {
    private LocalDate tglMasukUniv;
    private LinkedList<MatKulMahasiswa> matKulMahasiswa;


    public Mahasiswa(){super();}
    public Mahasiswa(String nik, String namaDepan, String namaBelakang, LocalDate tglLahir, String kotaLahir,
                     long nomorKTP, LocalDate tglMasukUniv, LinkedList<MatKulMahasiswa> matKulMahasiswa, Agama agama, Goldar goldar,
                     Gender gender){
        super(nik,namaDepan, namaBelakang, namaBelakang, tglLahir, kotaLahir, nomorKTP, agama, goldar, gender);
        this.tglMasukUniv = tglMasukUniv;
        this.matKulMahasiswa = matKulMahasiswa;

    }

    public void setTglMasukUniv(LocalDate tglMasukUniv){
        this.tglMasukUniv = tglMasukUniv;
    }
    public void setMatKulMahasiswa(LinkedList<MatKulMahasiswa> matKulMahasiswa){
        this.matKulMahasiswa = matKulMahasiswa;
    }

    public LocalDate getTglMasukUniv(){
        return this.tglMasukUniv;
    }
    public LinkedList<MatKulMahasiswa> getMatKulMahasiswa(){
        return this.matKulMahasiswa;
    }

    public String LamaBelajar(){
        Period periode = Period.between(this.tglMasukUniv, LocalDate.now());
        String LamaBelajar = String.format("%s tahun %s bulan %s hari", periode.getYears(), periode.getMonths(), periode.getDays());
        return LamaBelajar;

    }

    public String AgamaSiswa(){
        String agamaSiswa = null;
        switch (this.agama){
            case ISLAM :
                agamaSiswa = "Islam";
                break;

            case KRISTEN :
                agamaSiswa = "Kristen";
                break;

            case KONGHUCU :
                agamaSiswa = "Konghucu";
                break;

            case HINDU :
                agamaSiswa = "Hindu";
                break;

            case BUDDHA :
                agamaSiswa ="Buddha";
                break;

            default:
            break;
        }
        return agamaSiswa;
    }


    public void Summary(){
        System.out.println("First Name: " + this.namaDepan);
        System.out.println("Last Name: " + this.namaBelakang);
        System.out.println("Gender: " + this.gender);
        Locale indonesia = new Locale("id", "ID");
        DateTimeFormatter indofromat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
        System.out.println(String.format("Birth Information: %s, %s (%s Tahun)", this.kotaLahir, indofromat.format(this.tglLahir),
                Period.between(this.tglLahir, LocalDate.now()).getYears()));
        System.out.println("Religion: " + AgamaSiswa());
        System.out.println("Blood Type: " + this.goldar);
        System.out.println("ID Card: " + this.nik);
        Period periode = Period.between(this.tglMasukUniv, LocalDate.now());
        System.out.println(String.format("Entry Date (Duration): %s (%s)", indofromat.format(this.tglMasukUniv), LamaBelajar()));

        System.out.println("Enrollment Information: ");
        for(MatKulMahasiswa value : this.getMatKulMahasiswa()){
            System.out.println(String.format("%s in %s, (%s - %s), (%s), +%d poin", value.getMataKuliah().getNamaMatkul(),
                    value.getMataKuliah().getNamaPenjurusan(), value.getStartDate(), value.getEndDate(), value.LamaMatkul(),
                    value.getMataKuliah().getPoin()));
        }

    }

    public void NikNama(){
        System.out.println(String.format("NIK: %s, Name: %s", this.nik, this.namaDepan.concat(" ").concat(this.namaBelakang)));
    }



}
