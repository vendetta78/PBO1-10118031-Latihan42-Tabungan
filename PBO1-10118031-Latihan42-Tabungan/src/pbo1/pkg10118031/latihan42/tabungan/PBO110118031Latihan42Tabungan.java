package pbo1.pkg10118031.latihan42.tabungan;

import java.util.Scanner;
/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk Menghitung Tabungan
 */
public class PBO110118031Latihan42Tabungan {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.print("Saldo anda Sekarang : "
                + tabungan.ambilUang(scn.nextInt()) + "\n");
    }

}
