/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Scanner;

/**
 *
 * @author Akira
 */
public class Perpustakaan {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        //var temporary
      //  int jenisBuku;
        int tempId =0;
        String tempName = "";
        String tempGrade = "";
        
        int tempKodeBuku = 0;
        String tempNamaBuku = "";
        String tempJenisBuku;
        int tempKodeTransaksi = 0;
        int tempPengembalianBuku = 0;
        
        System.out.println("======================================================");
        System.out.println("               Input Cetak Bukti                   ");
        System.out.println("======================================================");
        
        System.out.print("Id Pelanggan  : ");
        tempId = input.nextInt();
        
        tempName = input.nextLine();
        System.out.print("Nama Siswa : ");
        tempName = input.nextLine();
        
        System.out.print("Grade Siswa : ");
        tempGrade = input.nextLine();
        
        System.out.print("\nNomor Buku : ");
        tempKodeBuku = input.nextInt();
        
        tempNamaBuku = input.nextLine();
        System.out.print("Nama Buku : ");
        tempNamaBuku = input.nextLine();
        
        System.out.print("Jenis Buku : ");
        tempJenisBuku = input.nextLine();
        
        System.out.print("Kode Transaksi : ");
        tempKodeTransaksi = input.nextInt();
        
//        System.out.println("\n Pengembalian Buku : ");
//        tempPengembalianBuku = input.nextInt();
        
        //eksekusi
        Transaction t = new Transaction(tempId, tempName, tempGrade);
        t.setBook(tempKodeBuku, tempNamaBuku, tempJenisBuku);
        t.setpengembalianBuku (tempKodeTransaksi);
        
        t.cetakBuktiPeminjaman();
    }
}
