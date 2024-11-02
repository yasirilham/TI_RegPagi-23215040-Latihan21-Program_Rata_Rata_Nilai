/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Rata-Rata Nilai
 */
import java.util.Scanner;
public class Latihan21_Program_Rata2_Nilai {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        double totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.printf("\nMaka, Rata-rata Nilainya adalah %.1f%n", rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
    }
}
