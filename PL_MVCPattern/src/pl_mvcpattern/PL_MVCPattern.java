    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl_mvcpattern;

/**
 *
 * @author Aryudha Wily
 */
public class PL_MVCPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student model = retriveStudentFromDataBase();
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        controller.setStudentName("Ronaldowati");
        
        controller.updateView();
    }
    
    private static Student retriveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Micah");
        student.setRollNo("10");
        return student;
    } 
}
