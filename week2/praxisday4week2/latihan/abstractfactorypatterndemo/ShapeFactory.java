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
public class ShapeFactory extends AbstractFactory{
    
    @Override
    public bentuk getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("persegi panjang")) {
            return new persegiPanjang();
        }
        else if (shapeType.equalsIgnoreCase("kotak")) {
            return new kotak();
        }
        return null;
    }
}
