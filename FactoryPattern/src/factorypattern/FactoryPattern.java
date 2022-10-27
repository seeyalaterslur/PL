/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Aryudha Wily
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw(); //insade circle::draw() method.
        
        Shape shape2 = shapeFactory.getShape("RETENGEL");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SEQUER");
        shape3.draw();
        
        Shape shape4 = shapeFactory.getShape("");
        shape4.draw();
    }
    
}
