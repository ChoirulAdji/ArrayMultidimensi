/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;
import java.util.Scanner;
/**
 *
 * @author Choirul Adji
 */
public class arrayMultidimensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0, grandTotal = 0;
        String brg[] = new String[5];
        int nota[][] = new int[5][3];
        
        do{
            System.out.println("==========SELAMAT DATANG DI TOKO==========");
            System.out.println("Silahkan pilih barang yang anda inginkan^^");
            System.out.println("1. T-shirt \n2. Jeans \n3. Jaket \n4. Selesai");
            System.out.print("Pilih : "); 
            pilih = sc.nextInt();

            switch(pilih){
                    case 1:
                            System.out.println("T-shirt : 125.000");
                            if(baris < 5){
                                    brg[baris] = "T-shirt";
                                    nota[baris][0] = 125000;
                                    System.out.print("Jumlah : ");
                                    jumlah = sc.nextInt();
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\ndaftar belanja anda");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang anda sudah penuh!\n");

                            }
                            break;
                    case 2:
                            System.out.println("Jeans : 110.000");
                            if(baris < 5){
                                    brg[baris] = "Jeans";
                                    nota[baris][0] = 110000;
                                    System.out.print("Jumlah : ");
                                    jumlah = sc.nextInt();
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\nDaftar belanja anda");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang anda sudah penuh!\n");
                            }
                            break;
                    case 3:
                            System.out.println("Jaket : 150.000");
                            if(baris < 5){
                                    brg[baris] = "Jaket";
                                    nota[baris][0] = 150000;
                                    System.out.print("Jumlah : ");
                                    jumlah = sc.nextInt();
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\nDaftar belanja anda");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang anda sudah penuh!\n");
                            }
                            break;
                    case 4:
                            System.out.println("\nSemua barang belanjaan anda");
                            for (int i = 0; i < baris; i++) {
                                    System.out.print((i + 1) + " ");
                                    System.out.print(brg[i] + " ");
                                    System.out.print(nota[i][0] + " ");
                                    System.out.print(nota[i][1] + " ");
                                    System.out.println(nota[i][2]);
                            }
                            System.out.println("Grand Totalnya adalah : " + grandTotal);
                            System.out.println("Terimakasih telah berkunjung");
                            System.out.println("Sampai berjumpa kembali^^");
                            System.out.println("====================================");
                            System.out.println("");
                            baris = 0;
                            grandTotal = 0;
                            break;
                }
        }while(pilih != 4);
    }
}   

    

