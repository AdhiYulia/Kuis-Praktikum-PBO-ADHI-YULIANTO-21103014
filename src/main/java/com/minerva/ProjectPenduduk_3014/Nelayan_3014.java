/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.ProjectPenduduk_3014;

/**
 *
 * @author VIOLA GITASYA
 */
public class Nelayan_3014 extends Penduduk_3014{
    int jmlBeratIkan_3014;
    int jmlSolar_3014;
    double totalPendapatNelayan_3014;

    public double totalPendapatNelayan_3014() {
        return totalPendapatNelayan_3014 = (jmlBeratIkan_3014 * 8.000) + (jmlSolar_3014 + 10.000);
    }
    
    public void DataNelayan_3014(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan_3014);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar_3014);
    }
}
