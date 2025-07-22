import java.util.Scanner;

public class Reading{
  public static void  main(String[] args){
    Scanner  input  = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name =input.nextLine();
    System.out.println("Your Age is :");
    int age =input.nextInt();
    System.out.println("My name is " +name +" and my age is "+age);
    input.close();
    
    
    
  }
}
