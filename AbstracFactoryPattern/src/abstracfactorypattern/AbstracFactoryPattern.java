/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstracfactorypattern;

/**
 *
 * @author Aryudha Wily
 */
public class AbstracFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var shapeFactory = FactoryProducer.getFactory("SHAPE");
        var colorFactory = FactoryProducer.getFactory("COLOR");
       
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
    }
    
}
