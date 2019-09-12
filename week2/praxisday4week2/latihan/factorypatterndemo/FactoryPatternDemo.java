/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.factorypatterndemo;

/**
 *
 * @author ramakira
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //get circle and call draw method
        Shape shape1 = shapeFactory.getShape("Circle");
        
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("Square");
        
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("Rectangle");
        
        shape3.draw();
    }
}
