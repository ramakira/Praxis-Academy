/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalmatrix;

import java.util.Scanner;

/**
 *
 * @author Akira
 */
public class TotalMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int m, n, a, b;
        Scanner input =  new Scanner(System.in);
        
        /**
         * baris dan kolom matriks di inputkan,
         * jika ingin didefinisikan tinggal diisi variabelnya.
         * 
         */
        System.out.println("Masukkan baris dan kolom matriks");
        m = input.nextInt();
        n = input.nextInt();
//       m=2;
//       n=2;
        
        int pertama[][] = new int[m][n];
        int kedua[][] = new int [m][n];
        int total[][] = new int [m][n];
        
        System.out.println("Masukkan element pertama dari matriks");
        
        for (a = 0; a < m; a++) {
            for (b = 0; b < n; b++) {
                pertama[a][b] = input.nextInt();
                
            }
        }
        
        System.out.println("Masukkan element kedua dari matriks");
        
        for (a = 0; a < m; a++) {
            for (b = 0; b < n; b++) {
                kedua[a][b] = input.nextInt();
            }
        }
        
        for (a= 0; a < m; a++) {
            for (b = 0; b < n; b++) {
                total[a][b] = pertama[a][b] + kedua[a][b];                
            }
        }
        
        System.out.println("Total dari matriks");
        
        for (a = 0; a < m; a++) {
            for (b = 0; b < n; b++) {
                System.out.println(total[a][b]+ "\t");
                
                System.out.println();
            }
        }
    }
    
}
