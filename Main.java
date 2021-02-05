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
    //Using boolean to determine if vehicle is electric or not
    System.out.println("True or False. You'r vehicle is electric.");
    boolean electricCar = scan.nextBoolean();
    
    //Adding if/else statements to print different things depending on what is answered above
    if (electricCar == true)
    {
      System.out.println("Congratulaions! Your vehicle is enviromently freindly and greatly reduces the carbon footprint in you area. " + "Also, thank you for driving a " + year1 + " " + car1 + " " + make1 + ".");
    }else{
    System.out.println("Since, you do drive a gas-powered vehicle.");
    }

    //I added this because I couldnt quite figure out how to have the question only print if the above if/else statment = true
    System.out.println("If you do have an electric vehicle, DO NOT answer the question below.");
    System.out.println("How many 'miles per gallon' does your car get?");
      int mpg1 = scan.nextInt();

    //Added another if/else statements to print different things depending on what is answered above
    if (mpg1 > 30)
    {
      System.out.println(" Congratulations! You drive a " + year1 + " " + car1 + " " + make1 + " which is considered enviromently friendly as it gets " + mpg1 + " 'miles per gallon' which decreases the carbon footprint in your area!");
    }else{
      System.out.println(" However, you drive a " + year1 + " " + car1 + " " + make1 + " which is NOT considered enviromently friendly as it gets" + mpg1 + " 'miles per gallon' which is under the recommended fuel efficiency rate which increases the carbon footprint in your area.");
    }
}
}
