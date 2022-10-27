/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Aryudha Wily
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Error: Private Constructor
        //SingleObject object = new SingleObject();
        
        SingleObject object = SingleObject.getInstance();
        object.showMassage();
    }
    
}
