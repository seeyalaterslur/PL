/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracfactorypattern;



/**
 *
 * @author Aryudha Wily
 */
import abstracfactorypattern.shape.Circle;
import abstracfactorypattern.shape.Rectangle;
import abstracfactorypattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null)
            return null;
    
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        
        else if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        
        else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        
        return null;
        
    }
    
}
