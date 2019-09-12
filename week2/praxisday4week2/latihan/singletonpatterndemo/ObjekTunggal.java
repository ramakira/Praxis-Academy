/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.singletonpatterndemo;

/**
 *
 * @author ramakira
 */
public class ObjekTunggal {
    
    //create objek of ObjekTunggal
    private static ObjekTunggal instance = new ObjekTunggal();
    
    //make constructor private so this class can't be instantiated
    private ObjekTunggal(){
        
    }
    
    //Get the only object available
    public static ObjekTunggal getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello World");
    }
}
