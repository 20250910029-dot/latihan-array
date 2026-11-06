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
public class Latihan2tiket {
    public static void main(String[] args) {
        // Tabel harga (array 2 dimensi): baris = kelas, kolom = jurusan
        //                  Bandung  Jakarta
        // Bisnis            40000    60000
        // Ekonomi           20000    40000
        String[] kelasData = {"Bisnis", "Ekonomi"};
        String[] jurusanData = {"Bandung", "Jakarta"};
        int[][] hargaData = {
            {40000, 60000},
            {20000, 40000}
        };

        String[] nama = new String[10];
        String[] jurusan = new String[10];
        String[] kelas = new String[10];
        int[] jumlah = new int[10];
        int[] harga = new int[10];
        int[] bayar = new int[10];

        String jawab = "";
        int i = 0;

        do {
            nama[i] = JOptionPane.showInputDialog("Masukan Nama Pembeli ");

            // Input jurusan, ulangi sampai valid
            int idxJurusan = -1;
            while (idxJurusan == -1) {
                String input = JOptionPane.showInputDialog("Masukan Jurusan (Bandung / Jakarta)");
                for (int k = 0; k < jurusanData.length; k++) {
                    if (jurusanData[k].equalsIgnoreCase(input)) {
                        idxJurusan = k;
                    }
                }
                if (idxJurusan == -1) {
                    JOptionPane.showMessageDialog(null, "Jurusan tidak ditemukan!");
                }
            }

            // Input kelas, ulangi sampai valid
            int idxKelas = -1;
            while (idxKelas == -1) {
                String input = JOptionPane.showInputDialog("Masukan Kelas (Bisnis / Ekonomi)");
                for (int k = 0; k < kelasData.length; k++) {
                    if (kelasData[k].equalsIgnoreCase(input)) {
                        idxKelas = k;
                    }
                }
                if (idxKelas == -1) {
                    JOptionPane.showMessageDialog(null, "Kelas tidak ditemukan!");
                }
            }

            jumlah[i] = Integer.valueOf(JOptionPane.showInputDialog("Masukan Jumlah Tiket"));

            jurusan[i] = jurusanData[idxJurusan];
            kelas[i] = kelasData[idxKelas];
            harga[i] = hargaData[idxKelas][idxJurusan];
            bayar[i] = harga[i] * jumlah[i];
            i++;

            if (i == nama.length) {
                JOptionPane.showMessageDialog(null, "Data sudah penuh (maksimal 10)");
                break;
            }
            jawab = JOptionPane.showInputDialog("Mau Tambah data lagi (Y/T)");
        } while (jawab != null && jawab.equalsIgnoreCase("Y"));

        System.out.println("========================================================================");
        System.out.println("No\tNama Pembeli\tJurusan\t\tKelas\t\tJum Tiket\tHarga\tBayar");
        System.out.println("========================================================================");
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + "\t" + nama[j] + "\t\t" + jurusan[j] + "\t\t"
                    + kelas[j] + "\t\t" + jumlah[j] + "\t\t" + harga[j] + "\t" + bayar[j]);
        }
        System.out.println("========================================================================");
    }
}