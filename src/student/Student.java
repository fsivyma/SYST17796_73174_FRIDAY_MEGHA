/*
    Name: Yan Hui Ma (Ivy)
    Assignment: 
    Program: 
    Date: 

    Description: 

*/
/*
 * This is my first version.
 * 
 * 
 */

package student;

import java.util.Scanner;

/**
 *
 * @author rebeccakong
 */
public class Student {
    private String studentID;
    private String studentName;
    private String studentProgram;
    private double studentGrade;
    private String studentYear;

    public Student() {
    }

    public Student(String studentID, String studentName, String studentProgram,
            double studentGrade, String studentYear) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentProgram = studentProgram;
        this.studentGrade = studentGrade;
        this.studentYear = studentYear;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        Student[] list = new Student[2];
        
        Scanner in = new Scanner(System.in);
        
        
        
            
        for (int i3 = 0; i3<list.length; i3++){
            list[i3] = new Student();
            System.out.println("Enter Student ID");
            list[i3].studentID = in.next();
            System.out.println("Enter Student name");
            list[i3].studentName = in.next();
            System.out.println("Enter Student Program");
            list[i3].studentProgram = in.next();
            System.out.println("Enter Student Year");
            list[i3].studentYear = in.next();
            System.out.println("Enter Student Grade");
            list[i3].studentGrade = in.nextInt();
            
        }
        
        for (int i3 = 0; i3<list.length; i3++){
            System.out.println("Student ID: " + list[i3].studentID 
                + " Student Name: "+ list[i3].studentName
                + " Student Program: " + list[i3].studentProgram
                + " Student Year: " + list[i3].studentYear
                + " Student Grade: " + list[i3].studentGrade);
        }
        
        
    }

}
