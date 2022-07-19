package com.company;

import java.time.LocalDate;
import java.time.Period;

public class MatKulMahasiswa implements IMatkulMahasiswa{


    private LocalDate startDate;
    private LocalDate endDate;
    private MataKuliah mataKuliah;


    public MatKulMahasiswa(){}
    public MatKulMahasiswa( MataKuliah mataKuliah, LocalDate startDate, LocalDate endDate){
        this.mataKuliah = mataKuliah;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public MatKulMahasiswa( MataKuliah mataKuliah, LocalDate startDate){
        this.mataKuliah = mataKuliah;
        this.startDate = startDate;
    }


    @Override
    public void setStartDate(LocalDate startDate) {

        this.startDate = startDate;
    }

    @Override
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public LocalDate getStartDate() {
        return this.startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return this.endDate;
    }

    @Override
    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }




    public String LamaMatkul(){
        if (this.endDate != null) {
            Period periode = Period.between(this.startDate, this.endDate);
            String LamaMatkul = String.format("%s tahun %s bulan %s hari", periode.getYears(), periode.getMonths(), periode.getDays());
            return LamaMatkul;
        }
        else {
            Period periode = Period.between(this.startDate, LocalDate.now());
            String LamaMatkul = String.format("%s tahun %s bulan %s hari", periode.getYears(), periode.getMonths(), periode.getDays());
            return LamaMatkul;
        }
    }

}
