import java.util.Scanner;


public class IfElseCondition {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int age ;
    double height;
    System.out.print("Enter your Height :");
    height=input.nextDouble();
    System.out.print("Enter your Age :");
    age= input.nextInt();
    
    
    if ((age>=18)&&(height>=140)) {
      System.out.print("Your are eligible to Enter the ride ");
    } else {
      System.out.print("Your are not eligible to Enter the ride");
    }
  }
}


