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
public class FactoryProducer {
    
    public static AbstractFactory getFactory(boolean bulat){
        if (bulat) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
        
    }
}
