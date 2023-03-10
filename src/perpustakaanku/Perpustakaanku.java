package perpustakaanku;

import java.util.Scanner;

public class Perpustakaanku {

    public static void main(String[] args) {

//        Deklarasi object scanner
        Scanner in = new Scanner(System.in);

//      Deklarasi variable  
        String jenisBuku; // menampung nama atau jenis buku
        int durasi, totalDenda, denda; // menampung durasi peminjaman dan denda buku
        int tenggat = 10; // menampung tenggat buku dengan nilai variable konstan yaitu 10.

        System.out.println("Selamat datang di Perpustakaanku....");
        System.out.println("");

        // Inputan
        System.out.print("Masukkan jenis buku (Pelajaran / Novel / Skripsi): ");
        jenisBuku = in.nextLine().toLowerCase();
        System.out.print("Masukkan durasi peminjaman                       : ");
        durasi = in.nextInt();

        // Looping perhitungan denda
        if (durasi > tenggat) {
            switch (jenisBuku) {
                case "pelajaran":
                    denda = 2000;
                    break;
                case "novel":
                    denda = 5000;
                    break;
                case "skripsi":
                    denda = 10000;
                    break;
                default:
                    System.out.println("Maaf, jenis buku yang Anda masukan salah!");
                    return;
            }

            // Perhitungan denda
            totalDenda = denda * (durasi - tenggat);

            // Output dengan memanggil hasil perhitungan denda jika dikenai denda
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Pengembalian buku melewati tenggat : " + (durasi - tenggat) + " hari.");
            System.out.println("Denda per hari                     : Rp " + denda);
            System.out.println("Anda dikenai denda sebesar         : Rp " + totalDenda);
            System.out.println("Rincian denda                      : " + (durasi - tenggat) + " hari x Rp " + denda + " = Rp " + totalDenda);

        } else {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Terima kasih, selamat datang kembali di Perpustakaanku..");
        }

        in.close();
    }
}
