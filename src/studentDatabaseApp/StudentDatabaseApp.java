package studentDatabaseApp;

import java.util.Scanner;

//You are a database administrator for a university and need to create an application to manage student erollments
//and balance
public class StudentDatabaseApp {
    //Ask the user how many new students will be added to the database
    //The user should be prompted to enter the name and year for each student
    //The student should have a 5-digit unique ID, with the first number being their grade level
    //A student can enroll in the following courses:
    //History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101
    //Each course costs $600 to enroll
    //The student should be able to view their balance and pay the tution
    //To see the status of the student, we should see their name, ID, courses enrolled and balance
    public static void main(String[] args) {

        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new students
        for(int n = 0; n< numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }
    }
}
