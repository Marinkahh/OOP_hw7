package org.example.seminar7;


import org.example.seminar7.controller.StudentController;
import org.example.seminar7.model.Student;
import org.example.seminar7.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Student model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();


        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("Марина");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Марина");
        student.setRollNo("25");
        return student;
    }
}
