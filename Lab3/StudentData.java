package ChapterThree.Lab3;
import java.util.Scanner;

public class StudentData {
    int roll;
    String first_name;
    String last_name;


    public StudentData(){
        roll = 9;
        first_name = "Ishwor";
        last_name = "Dulal";
    }

    public StudentData(int r, String f, String l){
        roll = r;
        first_name = f;
        last_name = l;
    }

    public void fullName(){
        System.out.println("Student's Name: " + first_name + " " + last_name);
    }

    public void checkRollNo(){
        if (roll %2 == 0){
            System.out.println("Even Roll Number");
        } else{
            System.out.println("Odd Roll Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input roll: ");
        int rollno = sc.nextInt();
        System.out.println("Input First name: ");
        String fname = sc.next();
        System.out.println("Input Last name: ");
        String lname = sc.next();
        StudentData student = new StudentData(rollno, fname, lname);
        System.out.println("Student's Roll No: " + student.roll);
        System.out.println("Student's First No: " + student.first_name);
        System.out.println("Student's Last No: " + student.last_name);
        student.fullName();
        student.checkRollNo();
        sc.close();
    }
}