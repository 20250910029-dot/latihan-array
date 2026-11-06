/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3a;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
public class Latihan3penjualan {
    public static void main(String[] args) {
        // Data barang (array)
        String[] kodeData = {"A01", "B02", "C03"};
        String[] namaBarangData = {"Hardisk", "Monitor", "Mouse"};
        int[] hargaData = {700000, 800000, 50000};

        String[] namaPembeli = new String[10];
        String[] kodeBarang = new String[10];
        String[] namaBarang = new String[10];
        int[] jumlah = new int[10];
        int[] harga = new int[10];
        int[] bayar = new int[10];

        String jawab = "";
        int i = 0;

        do {
            namaPembeli[i] = JOptionPane.showInputDialog("Masukan Nama Pembeli ");

            // Input kode barang, ulangi sampai kode ditemukan
            int idx = -1;
            while (idx == -1) {
                String kode = JOptionPane.showInputDialog(
                        "Masukan Kode Barang (A01 / B02 / C03)");
                for (int k = 0; k < kodeData.length; k++) {
                    if (kodeData[k].equalsIgnoreCase(kode)) {
                        idx = k;
                    }
                }
                if (idx == -1) {
                    JOptionPane.showMessageDialog(null, "Kode barang tidak ditemukan!");
                }
            }

            jumlah[i] = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah"));

            kodeBarang[i] = kodeData[idx];
            namaBarang[i] = namaBarangData[idx];
            harga[i] = hargaData[idx];
            bayar[i] = harga[i] * jumlah[i];
            i++;

            if (i == namaPembeli.length) {
                JOptionPane.showMessageDialog(null, "Data sudah penuh (maksimal 10)");
                break;
            }
            jawab = JOptionPane.showInputDialog("Mau Tambah data lagi (Y/T)");
        } while (jawab != null && jawab.equalsIgnoreCase("Y"));

        System.out.println("========================================================================");
        System.out.println("No\tNama Pembeli\tKodeBarang\tNamaBarang\tJumlah\tHarga\t\tBayar");
        System.out.println("========================================================================");
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + "\t" + namaPembeli[j] + "\t\t" + kodeBarang[j] + "\t\t"
                    + namaBarang[j] + "\t\t" + jumlah[j] + "\t" + harga[j] + "\t\t" + bayar[j]);
        }
        System.out.println("========================================================================");
    }
}