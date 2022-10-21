package VolumeKubus;

import java.util.Scanner;

public class VolumeKubus {

    public static void main(String[] args){
        System.out.println("== Program perhitungan volume kubus ==");
        Scanner input = new Scanner(System.in);
        double sisi, hasil;

        System.out.println("Masukkan sisi :");
        sisi = input.nextDouble();
        hasil = sisi*sisi*sisi;

        System.out.println("Hasil perhitungannya adalah : " +hasil);
    }
}

