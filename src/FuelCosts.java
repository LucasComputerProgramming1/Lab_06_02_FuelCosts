import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        //Declaring Variables
        double gallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        double travelDis = 0;
        double finalPrice = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        //Prompt For Gallons
        System.out.println("How many gallons are in your tank?");
        //Input For Gallons
        if(in.hasNextDouble())
        {
            gallons = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your input is invalid, please restart and try again.");
        }
        //Prompt For MPG
        System.out.println("What is your fuel efficiency in miles per gallon?");
        //Input For MPG
        if(in.hasNextDouble())
        {
            mpg = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your input is invalid, please restart and try again.");
        }
        //Prompt For Gas Price
        System.out.println("What is the current price of gas per gallon?");
        //Input For Gas Price
        if(in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your input is invalid, please restart and try again.");
        }
        //Processing Inputs
        travelDis = mpg*gallons;
        finalPrice = (100/mpg)*gasPrice;
        //Output
        System.out.println("The distance you can travel with your current tank is "+travelDis+" and the price of going 100 miles is $"+finalPrice+".");
    }
}