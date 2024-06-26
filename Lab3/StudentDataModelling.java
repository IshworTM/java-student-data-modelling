package ChapterThree.Lab3;

public class StudentDataModelling {
    int roll;
    String address;
    String first_name;
    String last_name;

    public StudentDataModelling(){
        roll = 00;
        address = "Umrika";
        first_name = "John";
        last_name = "Doe";
    }

    public StudentDataModelling(int rollNo, String add, String f_name, String l_name){
        this.roll = rollNo;
        this.address = add;
        this.first_name = f_name;
        this.last_name = l_name;
    }

    public void studentData(){
        System.out.println("Student's Name: " + first_name + " " + last_name);
        System.out.println("Student's Address: " + address);
        System.out.println("Student's RollNo: " + roll + "\n");
    }

    public static void main(String[] args) {
        StudentDataModelling student = new StudentDataModelling(15, "Satdobato", "Ishwor", "Dulal");
        student.studentData();
    }
}
