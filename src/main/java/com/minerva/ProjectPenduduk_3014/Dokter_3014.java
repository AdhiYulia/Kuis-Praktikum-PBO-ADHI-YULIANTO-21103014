/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.ProjectPenduduk_3014;

/**
 *
 * @author VIOLA GITASYA
 */
public class Dokter_3014 extends Penduduk_3014{
    int jmlPasien_3014;
    int jmlObat_3014;
    double totalPendapatanDokter_3014;
    
    public void DataDokter_3014(){
        System.out.println("Jumlah Pasien : " + jmlPasien_3014);
        System.out.println("Jumlah Obat : " + jmlObat_3014);
    }
    
    public double totalPendapatanDokter_3014 (){
        return totalPendapatanDokter_3014 = (jmlPasien_3014 * 50.000) + (jmlObat_3014 * 10.000);
    }
}
