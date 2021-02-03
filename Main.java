import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
  //Using scanner to allow input from user
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the year of your car?");
    int year1 = scan.nextInt();
    System.out.println("What is the make of your car?");
    String car1 = scan.next();
    System.out.println("What is the model of your car?");
    String make1 = scan.next();
    System.out.println("How many 'miles per gallon' does your car get?");
    int mpg1 = scan.nextInt();

  }
}