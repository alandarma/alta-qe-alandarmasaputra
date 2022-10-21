package VolumeBangunDatar;

import java.util.Scanner;

public class VolumeBangunDatar {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Volume Balok");
        System.out.println("*******************************");

        // logic
        System.out.println("Masukkan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar Balok: ");
        lebar = input.nextInt();
        System.out.println("Masukkan Tinggi Balok: ");
        tinggi = input.nextInt();

        // hitung volume balok
        hasil = panjang * lebar * tinggi;

        System.out.println("Volume Balok tersebut adalah:" + hasil);

    }
}
