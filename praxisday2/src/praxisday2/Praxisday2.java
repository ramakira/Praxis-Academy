/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praxisday2;

/**
 *
 * @author Akira
 */
public class Praxisday2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player petani = new Player();
        
        petani.name = "Rama";
        petani.speed = 50;
        petani.healthPoint = 100;
        petani.type = "strength";
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over!");
        }
    }
    
}
