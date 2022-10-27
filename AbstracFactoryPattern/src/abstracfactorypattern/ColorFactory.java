/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracfactorypattern;

import abstracfactorypattern.color.Blue;
import abstracfactorypattern.color.Green;
import abstracfactorypattern.color.Red;

/**
 *
 * @author Aryudha Wily
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if (color == null)
            return null;
    
        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }
        
        else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        
        else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        
        return null;
    }

    @Override
    Shape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
