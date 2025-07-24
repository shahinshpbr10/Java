import java.util.Scanner;

public class FunctionJava{

  public static int add(int a, int b){
    return a+b;
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number yiu need ti perform Multiplication :");
    int choice =input.nextInt();
    
    int sum =add(choice,choice);
    System.out.println("Sum is :"+sum);

    System.out.println("Multiplication Table for "+choice+" is :");
    System.out.println("*****************************************");

    for(int i=1; i<=10; i++){
      System.out.println(choice+"*"+i+"="+(choice*i));
    }
  }
  
}

