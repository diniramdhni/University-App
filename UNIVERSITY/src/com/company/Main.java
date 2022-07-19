package com.company;

import ListEnum.Agama;
import ListEnum.Gender;
import ListEnum.Goldar;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here




        University unicorn = new University();
        University.setNamaUniv("Unicorn (University of Cornelius)");
        University.setTglBerdiri(LocalDate.of(1966, 7, 12));
        unicorn.setAlamat("Amerika Serikat, Southern State, di kota Texas");



        MataKuliah oop = new MataKuliah("Object Oriented Programming",  "Programming", 20);
        MataKuliah datastructure = new MataKuliah("Data Structure", "Programming", 30);
        MataKuliah networking = new MataKuliah("Networking Fundamental", "Networking", 20);
        MataKuliah database = new MataKuliah("Database Fundamental", "Programming", 30);
        MataKuliah pmp = new MataKuliah("Project Management Professional", "Management and Analysis", 40);
        MataKuliah uml = new MataKuliah("Unified Modelling Language", "Management and Analysis", 20);
        MataKuliah java = new MataKuliah("Java Fundamental", "Programming", 30);
        MataKuliah design = new MataKuliah("Infrastructure Design", "Networking", 30);
        MataKuliah networksecurity = new MataKuliah("Network and Security", "Networking", 20);

        MatKulMahasiswa Alex1 = new MatKulMahasiswa( oop, LocalDate.of(2022, 4, 12), LocalDate.of(2022,9, 12));
        MatKulMahasiswa Alex2 = new MatKulMahasiswa(datastructure, LocalDate.of(2021,9, 18));

//
        Mahasiswa Alex = new Mahasiswa("A021", "Alex", "Wirianata", LocalDate.of(1990, 11, 23),
                "Jakarta", 312008923111990002L, LocalDate.of(2018, 4, 12), new LinkedList<>(Arrays.asList(Alex1, Alex2)),
                Agama.KRISTEN, Goldar.A, Gender.PRIA);
//


        //tambahin matkul desi oop
//
        MatKulMahasiswa Desi1 = new MatKulMahasiswa(networking, LocalDate.of(2022, 4, 1));
        MatKulMahasiswa Desi2 = new MatKulMahasiswa(datastructure, LocalDate.of(2022, 9, 18));
        Mahasiswa Desi = new Mahasiswa("A022", "Desy", "Oktaviani",
                LocalDate.of(1995, 5, 11),"Bandung", 312008911051995002L,
                LocalDate.of(2022, 4, 1), new LinkedList<>(Arrays.asList(Desi1, Desi2, Alex1)),
                Agama.ISLAM, Goldar.O, Gender.WANITA);
        //bikin objek imatakuliah

        IMatkulMahasiswa bebas = new MatKulMahasiswa();
        bebas = Desi1;
        System.out.println(bebas.getMataKuliah().namaMatkul);


//
        MatKulMahasiswa Joko1 = new MatKulMahasiswa( uml, LocalDate.of(2021, 6, 3), LocalDate.of(2021, 11, 1));
        Mahasiswa Joko = new Mahasiswa("A023", "Joko", "Davidson",
                LocalDate.of(1990, 6, 7),"Jakarta", 3120089277889990002L,
                LocalDate.of(2021, 5, 14), new LinkedList<>(Arrays.asList(Joko1)),
                Agama.ISLAM, Goldar.A, Gender.PRIA);


//

        Dosen Antik = new Dosen("T701", "Antik", "Hanya", LocalDate.of(1988, 11, 12), "Jakarta",
                312008912111988002L, new BigDecimal(7500000), LocalDate.of(2016, 3, 8), new LinkedList<>(Arrays.asList(uml, networksecurity)),
                Agama.ISLAM, Goldar.A, Gender.WANITA);

        Dosen Cahya = new Dosen("T808", "Cahya", "Subroto", LocalDate.of(1989, 1, 7), "Surabaya",
                312008907011989002L, new BigDecimal(9500000), LocalDate.of(2016, 4, 4),
               new LinkedList<>(Arrays.asList(oop, java, database)), Agama.ISLAM, Goldar.B, Gender.PRIA);

//
        Dosen Mikha = new Dosen("T904", "Mikha", "Riana", LocalDate.of(1989, 7, 4),
                "Jakarta", 317572993601980002L, new BigDecimal(6000000), LocalDate.of(2022, 7, 4),
                new LinkedList<>(Arrays.asList(design, datastructure)), Agama.KRISTEN, Goldar.A, Gender.WANITA);

        LinkedList<Mahasiswa> AllStudent = new LinkedList<>();
        AllStudent.add(Alex);
        AllStudent.add(Desi);
        AllStudent.add(Joko);

        ArrayList<Dosen> AllDosen = new ArrayList<>();
        AllDosen.add(Antik);
        AllDosen.add(Cahya);
        AllDosen.add(Mikha);

//        String dinni = "coba";
//        if(dinni.equals(
//                for(Dosen value : AllDosen){value.getNik();}))
//        {
//            System.out.println("jbc");
//        }


        CaseUtama(Menu(), AllStudent, AllDosen, unicorn);







    }

    //metod static return listmahasiswa
    //buat objek person sgbai mahasiswa
    public static LinkedList<Mahasiswa> objekpersonmahasiswa (){

        Person dini = new Mahasiswa();
        dini.namaDepan = "Dini";
        dini.namaBelakang = "Ramadhani";
        dini.nik = "1711512011";
        Person rahma = new Mahasiswa();
        rahma.namaDepan = "Rahma";
        rahma.namaBelakang = "Tri";
        rahma.nik = "1711519001";


        //eksplisit
        Mahasiswa Dini = new Mahasiswa();
        Mahasiswa Rahma = (Mahasiswa)rahma;

        Dini = (Mahasiswa)dini;


        //tanpa tampungn
        LinkedList<Mahasiswa> listmahasiswa = new LinkedList<>(Arrays.asList((Mahasiswa) dini, (Mahasiswa) rahma));

        return listmahasiswa;
    }


    public static int Menu(){
        System.out.println("""
                Pilih nomor menu untuk masuk ke menunya:
                1. All Student Data
                2. All Tutor Data
                3. About this University
                4. Exit Application
                Masukkan pilihan anda: """);
        int pilihan = 0;
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 4) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-4");
                cek = false;
            }
        }
        while (cek == false);
        return pilihan;

    }

    public static void AllStudentData(LinkedList<Mahasiswa> AllStudent){
        for(Mahasiswa value : AllStudent){
            value.NikNama();
        }

    }
    public static void AllTutorData(ArrayList<Dosen> AllDosen){
            for (Dosen value : AllDosen) {
                value.NikNama();
            }
    }

    public static int SubMenu1(){
        System.out.println("""
                Pilih nomor menu untuk masuk ke menunya:
                1. Student Information
                2. Back to Main Menu
                3. Exit Application
                Masukkan Pilihan Anda: """);
        int pilihan = 0;
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 3) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }
        while (cek == false);
        return pilihan;
    }

    public static int SubMenu2(){
        System.out.println("""
                Pilih nomor menu untuk masuk ke menunya:
                1. Tutor Information
                2. Back to Main Menu
                3. Exit Application
                Masukkan Pilihan Anda: """);
        int pilihan = 0;
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 3) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }
        while (cek == false);
        return pilihan;
    }


    public static void StudentInformation(LinkedList<Mahasiswa> AllStudent){
        System.out.println("Masukan nomor NIK yang anda ingin lihat informasinya: ");
        Scanner scanner = new Scanner(System.in);
        String inputNik = scanner.nextLine().trim();
        for(Mahasiswa nilai : AllStudent){
            if (inputNik.equals(nilai.getNik())){
                nilai.Summary();
            }
        }
    }

    public static void TutorInformation(ArrayList<Dosen> AllDosen){
        System.out.println("Masukan nomor NIK yang anda ingin lihat informasinya: ");
        Scanner scanner = new Scanner(System.in);
        String inputNik = scanner.nextLine().trim();
            for (Dosen nilai : AllDosen) {
                    if (inputNik.equals(nilai.getNik())) {
                        nilai.Summary();
                    }
            }
    }

    public static int SubmenuAfterStudentinformation(){
        System.out.println("""
                Pilih nomor menu untuk masuk ke menunya:
                1. Back to All Student Data
                2. Back to Main Menu
                3. Exit Application
                Masukkan Pilihan Anda: """);
        int pilihan = 0;
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 3) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }
        while (cek == false);
        return pilihan;
    }

    public static int SubmenuAfterTutorInformation(){
        System.out.println("""
                Pilih nomor menu untuk masuk ke menunya:
                1. Back to All Tutor Data
                2. Back to Main Menu
                3. Exit Application
                Masukkan Pilihan Anda: """);
        int pilihan = 0;
        boolean cek = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
                if (pilihan >= 1 && pilihan <= 3) {
                    cek = true;
                }
            } catch (Exception ex) {
                System.out.println("harus angka 1-3");
                cek = false;
            }
        }
        while (cek == false);
        return pilihan;
    }

    public static void CaseUtama(int pilihan, LinkedList<Mahasiswa> AllStudent, ArrayList<Dosen> AllDosen, University unicorn){
        switch (pilihan){
            case 1 :
                AllStudentData(AllStudent);
                CaseMenuStudent(SubMenu1(), AllStudent, AllDosen, unicorn);
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 2 :
                AllTutorData(AllDosen);
                CaseMenuTutor(SubMenu2(), AllStudent, AllDosen, unicorn);
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 3 :
                unicorn.AboutThisUniversity();
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

    public static void CaseMenuStudent(int pilihan, LinkedList<Mahasiswa> AllStudent, ArrayList<Dosen> AllDosen, University unicorn){
        switch (pilihan){
            case 1 :
                StudentInformation(AllStudent);
                CaseMenuStudent1(SubmenuAfterStudentinformation(), AllStudent, AllDosen, unicorn);
                break;
            case 2 :
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                break;
        }
    }
    public static void CaseMenuStudent1(int pilihan, LinkedList<Mahasiswa> AllStudent, ArrayList<Dosen> AllDosen, University unicorn){
        switch (pilihan){
            case 1 :
                AllStudentData(AllStudent);
                CaseMenuStudent(SubMenu1(), AllStudent, AllDosen, unicorn);
                break;
            case 2 :
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

    public static void CaseMenuTutor(int pilihan, LinkedList<Mahasiswa> AllStudent, ArrayList<Dosen> AllDosen, University unicorn){
        switch (pilihan){
            case 1 :
                TutorInformation(AllDosen);
                CaseMenuTutor1(SubmenuAfterTutorInformation(), AllStudent, AllDosen, unicorn);
                break;
            case 2 :
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

    public static void CaseMenuTutor1(int pilihan, LinkedList<Mahasiswa> AllStudent, ArrayList<Dosen> AllDosen, University unicorn){
        switch (pilihan){
            case 1 :
                AllTutorData(AllDosen);
                CaseMenuTutor(SubMenu2(), AllStudent, AllDosen, unicorn);
                break;
            case 2 :
                CaseUtama(Menu(), AllStudent, AllDosen, unicorn);
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.out.println(" ");
                break;
        }
    }


}
