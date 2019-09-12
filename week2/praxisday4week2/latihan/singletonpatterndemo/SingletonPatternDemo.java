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
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        //Get the only object available
        ObjekTunggal object = ObjekTunggal.getInstance();

        object.showMessage();
    }
}
