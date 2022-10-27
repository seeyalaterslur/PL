/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessNumber;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Aryudha Wily
 */
@Named
@SessionScoped
public class UserNumberBean implements Serializable {
    private int generateRandomNumber;
    private int userNumber;
    private String response;
    
    public UserNumberBean(){
        Random randomGR = new Random();
        generateRandomNumber = randomGR.nextInt(10);
        System.out.println("Random number: " + generateRandomNumber);
    }
    
    public int getUserNumber(){
        return userNumber;
    }
    
    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }
    
    public String getResponse(){
        if (userNumber == generateRandomNumber){
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context
                    .getExternalContext()
                    .getSession(false);
            session.invalidate();
            
            return "Yey! You got it!";
        }
        else {
            return "<p>Sorry, " + userNumber + " isn't it.<p>" + "<P>guess again...<p>";
        }
    }
}
