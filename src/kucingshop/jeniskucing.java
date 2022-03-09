/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucingshop;

import java.util.Scanner;

/**
 *
 * @author ARZA
 */
public class jeniskucing extends tokokucing {
    public void bagianjeniskucing() {
        System.out.println("jenis kucing " + super.bidang);
    }
    
    public String nama, jk, tanggal;
    public int nk,njk;

    public void identitas() {
        Scanner input = new Scanner(System.in);
        System.out.println(" British Shorthair       (1)");
        System.out.println(" Anabul                  (2)");
        System.out.println(" Spyx                    (3)");
        System.out.println(" Longhair                (4)");
        System.out.println(" Kucing Kapmung          (5)");
       
        System.out.println("pilih salah satu id jenis kucing  diatas: ");
        int id = input.nextInt();
        switch (id) {
            case 1 -> {
                System.out.println("Nama : Star");
                System.out.println("Jenis kucing : British Shorthair");
                System.out.println("Tanggal Lahir : 13 Oktober ");
                System.out.println(1);
            }

            case 2 -> {
                System.out.println("Nama : Dubu");
                System.out.println("Jenis kucing : Anabul");
                System.out.println("Tanggal Lahir : 17 Januari");
                System.out.println(2);
            }

            case 3 -> {
                System.out.println("Nama : Udin");
                System.out.println("Jenis kucing : Spynx ");
                System.out.println("Tanggal Lahir : 28 November");
                System.out.println(3);
            }

            case 4 -> {
                System.out.println("Nama : Suukii");
                System.out.println("Jenis kucing : Longhair ");
                System.out.println("Nomor guru : 11 Oktober");
                System.out.println(4);
            }
                
            case 5 -> {
                System.out.println("Nama : Cemot ");
                System.out.println("Jenis kucing : Kucing Kampung ");
                System.out.println("Tanggal Lahir : 1 Mei");
                System.out.println(5);
            }
                                           
            default -> System.out.println("Error! id guru tidak ditemukan");
        }
    }
}
