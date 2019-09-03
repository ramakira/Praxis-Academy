/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author Akira
 */
public class Transaction extends Student implements Book {
    private int kodeBuku;
    private String namaBuku;
    //private int jenisBuku;
    private String tempJenisBuku;
    private int kodeTransaksi;
    
    
    public Transaction(){
    }
    
    public Transaction(int id, String name, String grade){
        super(id, name, grade);
    }
    
    public void setpengembalianBuku(int kodeTransaksi){
        this.kodeTransaksi = kodeTransaksi;
    }
    
    public String pengembalianBuku(String tempJenisBuku){
        switch (this.tempJenisBuku) {
            case "1":
                return "Buku Harus dikembalikan dalam waktu 7 hari";
            case "2":
                return "Buku Harus dikembalikan dalam waktu 4 hari";
            case "3":
                return "Buku Harus dikembalikan dalam waktu 2 hari";
            default: 
                return "Inputan anda salah";
        }
    }
    
    public void setBook(int kodeBuku, String namaBuku, String tempJenisBuku){
        this.kodeBuku = kodeBuku;
        this.namaBuku = namaBuku;
      //  this.jenisBuku = jenisBuku;
        this.tempJenisBuku = tempJenisBuku;
    }
    
    
    
    public void cetakBuktiPeminjaman(){
        
        System.out.println("\n");
        System.out.println("=============================================================");
        System.out.println("                Struk Peminjaman Buku");
        System.out.println("=============================================================");
        System.out.println("ID Siswa ; " + super.getId());
        System.out.println("Nama Siswa : " + super.getName());
        System.out.println("Kelas Siswa : " + super.getGrade());
        
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Nama Buku : " + namaBuku);
        System.out.println("jenis Buku : " + tempJenisBuku);
        
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        
        System.out.println("Pengembalian Buku : " + pengembalianBuku(tempJenisBuku));
        
        System.out.println("=============================================================");
        System.out.println("                       Terimakasih ");
        System.out.println("=============================================================");
    }
}
