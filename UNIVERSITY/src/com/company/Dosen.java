package com.company;

import ListEnum.Agama;
import ListEnum.Gender;
import ListEnum.Goldar;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Dosen extends Person{
    private BigDecimal gaji;
    private LocalDate tglBekerja;
    private LinkedList<MataKuliah> mataKuliah;

    public Dosen(){}
    public Dosen(String nik, String namaDepan, String namaBelakang, LocalDate tglLahir, String kotaLahir,
                 long nomorKTP, BigDecimal gaji, LocalDate tglBekerja, LinkedList<MataKuliah> mataKuliah, Agama agama,
                 Goldar goldar, Gender gender){
        super(nik,namaDepan, namaBelakang, namaBelakang, tglLahir, kotaLahir, nomorKTP, agama, goldar, gender);
        this.gaji = gaji;
        this.tglBekerja = tglBekerja;
        this.mataKuliah = mataKuliah;
    }

    public void setGaji(BigDecimal gaji){
        this.gaji = gaji;
    }
    public void setTglBekerja(LocalDate tglBekerja){
        this.tglBekerja = tglBekerja;
    }
    public void setMataKuliah(LinkedList<MataKuliah> mataKuliah){
        this.mataKuliah = mataKuliah;
    }

    public BigDecimal getGaji(){
        return this.gaji;
    }
    public LocalDate getTglBekerja(){
        return this.tglBekerja;
    }
    public LinkedList<MataKuliah> getMataKuliah(){
        return this.mataKuliah;
    }

    public String LamaBekerja(){
        Period periode = Period.between(this.tglBekerja, LocalDate.now());
        String LamaBekerja = String.format("%s tahun %s bulan %s hari", periode.getYears(), periode.getMonths(), periode.getDays());
        return LamaBekerja;
    }
    public String AgamaDosen(){
        String agamaDosen = null;
        switch (this.agama){
            case ISLAM :
                agamaDosen = "Islam";
                break;

            case KRISTEN :
                agamaDosen = "Kristen";
                break;

            case KONGHUCU :
                agamaDosen = "Konghucu";
                break;

            case HINDU :
                agamaDosen = "Hindu";
                break;

            case BUDDHA :
                agamaDosen ="Buddha";
                break;

            default:
                break;
        }
        return agamaDosen;
    }

    public void Summary(){
        System.out.println("First Name: " + this.namaDepan);
        System.out.println("Last Name: " + this.namaBelakang);
        System.out.println("Gender: " + this.gender);
        Locale indonesia = new Locale("id", "ID");
        DateTimeFormatter indofromat = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", indonesia);
        System.out.println(String.format("Birth Information: %s, %s (%s Tahun)", this.kotaLahir, indofromat.format(this.tglLahir),
                Period.between(this.tglLahir, LocalDate.now()).getYears()));
        System.out.println("Religion: " + AgamaDosen());
        System.out.println("Blood Type: " + this.goldar);
        System.out.println("ID Card: " + this.nik);
        Period periode = Period.between(this.tglBekerja, LocalDate.now());
        System.out.println(String.format("Hire Date (Duration): %s (%s)", indofromat.format(this.tglBekerja), LamaBekerja()));
        String rupiah = NumberFormat.getCurrencyInstance(indonesia).format(this.gaji);
        System.out.println("Salary permonth: " + rupiah);
        System.out.println("Competency Information: ");
        for (MataKuliah value : this.mataKuliah) {
            System.out.println(String.format("%s in %s", value.getNamaMatkul(), value.getNamaPenjurusan()));
        }

    }
    public void NikNama(){
        System.out.println(String.format("NIK: %s, Name: %s", this.nik, this.namaDepan.concat(" ").concat(this.namaBelakang)));

    }
}
