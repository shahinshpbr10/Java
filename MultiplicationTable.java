import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Choice :");
    int choice = input.nextInt();
    System.out.println("Multiplication Table for " + choice + " is :");
    System.out.println("**************************************");
    if (choice == 0) {
      System.out.println("Please enter the number greater than 0");
    } else {
      for (int i = 1; i <= 10; i++) {
        System.out.println(choice + "*" + i + "=" + (choice * i));
      }
    }

  }
}