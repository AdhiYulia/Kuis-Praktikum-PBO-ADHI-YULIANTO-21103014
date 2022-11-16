/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.ProjectPenduduk_3014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author VIOLA GITASYA
 */
public class ProjectPenduduk_3014 {
    public static void main(String[] args) {

        //Menambahkan object
        Nelayan_3014 n1 = new Nelayan_3014();
        Nelayan_3014 n2 = new Nelayan_3014();
        Dokter_3014 d1 = new Dokter_3014();
        Dokter_3014 d2 = new Dokter_3014();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Data Nelayan 1");
            System.out.println("NIK : ");
            n1.nik_3014 = br.readLine();
            System.out.println("Nama : ");
            n1.nama_3014 = br.readLine();
            System.out.println("Umur : ");
            n1.umur_3014 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat_3014 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan_3014 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar_3014 = Integer.parseInt(br.readLine());
          
            System.out.println();
            
            System.out.println("Data Nelayan 2");
            System.out.println("NIK : ");
            n2.nik_3014 = br.readLine();
            System.out.println("Nama : ");
            n2.nama_3014 = br.readLine();
            System.out.println("Umur : ");
            n2.umur_3014 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat_3014 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jmlBeratIkan_3014 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jmlSolar_3014 = Integer.parseInt(br.readLine());
            
            System.out.println();
            
            System.out.println("Data Dokter 1");
            System.out.println("NIK : ");
            d1.nik_3014 = br.readLine();
            System.out.println("Nama : ");
            d1.nama_3014 = br.readLine();
            System.out.println("Umur : ");
            d1.umur_3014 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat_3014 = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jmlPasien_3014 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jmlObat_3014 = Integer.parseInt(br.readLine());
            

            System.out.println();
            
            System.out.println("Data Dokter 2");
            System.out.println("NIK : ");
            d2.nik_3014 = br.readLine();
            System.out.println("Nama : ");
            d2.nama_3014 = br.readLine();
            System.out.println("Umur : ");
            d2.umur_3014 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat_3014 = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien_3014 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat_3014 = Integer.parseInt(br.readLine());
       
            System.out.println();
            
            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk_3014();
            n1.DataNelayan_3014();
            n1.totalPendapatNelayan_3014();
            
            System.out.println();
            
            n2.tampilDataPenduduk_3014();
            n2.DataNelayan_3014();
            n2.totalPendapatNelayan_3014();
            
            System.out.println();
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk_3014();
            d1.DataDokter_3014();
            d1.totalPendapatanDokter_3014();
            
            System.out.println();
            
            d2.tampilDataPenduduk_3014();
            d2.DataDokter_3014();
            d2.totalPendapatanDokter_3014();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
