// Write a Java program to demonstrate inheritance concept and role of access modifier in inheritance.
// Use public,private,protected and default access modifier in java program.
package ChapterThree.Lab1;

public class IntroToInheritance {
    public String name;
    private int accountNumber = 40;
    protected float price;
    int modelNumber;


    public static void main(String[] args) {
        IntroToInheritance obj = new IntroToInheritance();
        System.out.println(obj.accountNumber);
    }
}
