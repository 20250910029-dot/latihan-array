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
public class latihan1nilai {
    // Menampilkan angka bulat tanpa ".0" (80.0 -> 80), angka pecahan tetap (77.5)
    static String format(double x) {
        if (x == (int) x) {
            return String.valueOf((int) x);
        }
        return String.valueOf(x);
    }

    // Menentukan index berdasarkan nilai akhir
    static char tentukanIndex(double nilai) {
        if (nilai >= 80) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 60) return 'C';
        else if (nilai >= 50) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        String[] nim = new String[10];
        String[] nama = new String[10];
        double[] uts = new double[10];
        double[] uas = new double[10];
        double[] nilaiAkhir = new double[10];
        char[] index = new char[10];

        String jawab = "";
        int i = 0;

        do {
            nim[i] = JOptionPane.showInputDialog("Masukan Nim ");
            nama[i] = JOptionPane.showInputDialog("Masukan Nama ");
            uts[i] = Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai UTS"));
            uas[i] = Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai UAS"));

            // UTS 50%, UAS 50%
            nilaiAkhir[i] = (uts[i] * 0.5) + (uas[i] * 0.5);
            index[i] = tentukanIndex(nilaiAkhir[i]);
            i++;

            if (i == nim.length) {
                JOptionPane.showMessageDialog(null, "Data sudah penuh (maksimal 10)");
                break;
            }
            jawab = JOptionPane.showInputDialog("Mau Tambah data lagi (Y/T)");
        } while (jawab != null && jawab.equalsIgnoreCase("Y"));

        System.out.println("======================================================");
        System.out.println("No\tNim\tNama\t\tUTS\tUAS\tNilai Akhir\tIndex");
        System.out.println("======================================================");
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + "\t" + nim[j] + "\t" + nama[j] + "\t\t"
                    + format(uts[j]) + "\t" + format(uas[j]) + "\t"
                    + format(nilaiAkhir[j]) + "\t\t" + index[j]);
        }
        System.out.println("======================================================");
    }
}