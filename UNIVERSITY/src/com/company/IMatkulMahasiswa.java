package com.company;

import java.time.LocalDate;

public interface IMatkulMahasiswa {
    public void setStartDate(LocalDate startDate);
    public void setEndDate(LocalDate endDate);
    public void setMataKuliah(MataKuliah mataKuliah);




    public LocalDate getStartDate();
    public LocalDate getEndDate();
    public MataKuliah getMataKuliah();
}
