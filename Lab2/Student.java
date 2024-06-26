package ChapterThree.Lab2;

public class Student {
    String name;
    int rollNo;
    String address;

    //Non-Parameterized Constructor
    public Student(){
        rollNo = 10;
        name = "Ishwor";
        address = "Hattiban";
    }

    //Parameterized Constructor
    public Student(int roll, String studentName, String studentAddress){
        rollNo = roll;
        name = studentName;
        address = studentAddress;
    }
}