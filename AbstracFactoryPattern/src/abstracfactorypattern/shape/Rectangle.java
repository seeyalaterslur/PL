/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracfactorypattern.shape;

import abstracfactorypattern.Shape;

/**
 *
 * @author Aryudha Wily
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Ini Rectangle::draw() method.");
    }
    
}
