/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Aryudha Wily
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null)
            return null;
    
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new circle();
        }
        
        else if (shapeType.equalsIgnoreCase("SEQUER")){
            return new squer();
        }
        
        else if (shapeType.equalsIgnoreCase("RETENGEL")){
            return new Retengel();
        }
        
        return null;
        
    }
}
