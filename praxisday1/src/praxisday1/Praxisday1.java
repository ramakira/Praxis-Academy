/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praxisday1;

import java.util.Scanner;

/**
 *
 * @author Akira
 */
public class Praxisday1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, status;

        Scanner input = new Scanner(System.in);

        
        System.out.println("Masukkan nama anda : ");
        nama = input.nextLine(); // input nama

        System.out.println("Status pernikahan (sudah/belum) : ");
        status = input.nextLine(); // input status

        if (status.equals("sudah")) { // kondisi sudah
            System.out.println("Selamat saudara " + nama + " anda beruntung");
        } else if (status.equals("belum")) { // kondisi belum
            System.out.println("Mohon maaf saudara " + nama + " anda belum beruntung");
        } else { // kondisi diluar sudah dan belum
            System.out.println("Mohon maaf anda tidak memasukkan status dengan benar");
        }

        System.out.println("Selesai");
    }
}
