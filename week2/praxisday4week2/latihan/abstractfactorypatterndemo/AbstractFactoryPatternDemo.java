/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.abstractfactorypatterndemo;

/**
 *
 * @author ramakira
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rounded Rectangle
        bentuk shape1 = shapeFactory.getShape("persegi panjang");
        //call draw method of Shape Rectangle
        shape1.ambil();
        //get an object of Shape Rounded Square 
        bentuk shape2 = shapeFactory.getShape("kotak");
        //call draw method of Shape Square
        shape2.ambil();
        //get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        bentuk shape3 = shapeFactory1.getShape("persegi panjang");
        //call draw method of Shape Rectangle
        shape3.ambil();
        //get an object of Shape Square 
        bentuk shape4 = shapeFactory1.getShape("kotak");
        //call draw method of Shape Square
        shape4.ambil();

    }
}
