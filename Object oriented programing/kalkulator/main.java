import java.util.Scanner;

public class main {

    public static void main(String[] args){
        String pilih_kondisi;
        int nilai_a = 0;
        int nilai_b = 0;
        double hasil;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("____________________________");
        System.out.println("PILIHAN PENJUMLAHAN ARITMATIKA");
        System.out.println("============================");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("____________________________");
        System.out.println("Masukkan pilihan [1/2/3/4]: ");
        pilih_kondisi = input_pilihan.next();

        if (pilih_kondisi.equals(1)){
            System.out.println("Masukkan Nilai A: ");
            nilai_a = 3;
            nilai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = 4;
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a + nilai_b;

            System.out.println("Masukkan nilai A adalah: " + nilai_a );
            System.out.println("Masukkan nilai B adalah: "  + nilai_b);
            System.out.println("Hasil penjumlahan adalah: " + hasil);

        } else if (pilih_kondisi.equals("2")) {
            System.out.println("Masukkan Nilai A: ");
            nilai_a = 15;
            nilai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = 4;
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a - nilai_b;

            System.out.println("Masukkan nilai A adalah: " + nilai_a );
            System.out.println("Masukkan nilai B adalah: "  + nilai_b);
            System.out.println("Hasil penjumlahan adalah: " + hasil);

        } else if (pilih_kondisi.equals("3")) {
            System.out.println("Masukkan Nilai A: ");
            nilai_a = 10;
            nilai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = 10;
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a * nilai_b;

            System.out.println("Masukkan nilai A adalah: " + nilai_a );
            System.out.println("Masukkan nilai B adalah: "  + nilai_b);
            System.out.println("Hasil penjumlahan adalah: " + hasil);

        } else if (pilih_kondisi.equals(4)) {
            System.out.println("Masukkan Nilai A: ");
            nilai_a = 12;
            nilai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = 3;
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a / nilai_b;

            System.out.println("Masukkan nilai A adalah: " + nilai_a );
            System.out.println("Masukkan nilai B adalah: "  + nilai_b);
            System.out.println("Hasil penjumlahan adalah: " + hasil);

        } else {
            System.out.println("Pilihan tidak ada!");
        }
        System.out.println("1.  3+4=7");
        System.out.println("2.  15-4=11");
        System.out.println("3.  10*10=100");
        System.out.println("4.  12/3=4");
    }
}
