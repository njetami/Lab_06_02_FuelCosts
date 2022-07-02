import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mpg = 0;
        double gasPrice = 0;
        double gasInTank =0;


        System.out.println("I can calculate the cost of driving your car for 100 miles. I can also say how far you can go with what is in your tank");

        System.out.print("how much is a gallon of gas curently:");

        gasPrice = in.nextDouble();
        in.nextLine();

        System.out.print("How many gallons of gas is in your Tank:");

        gasInTank = in.nextDouble();
        in.nextLine();

        System.out.print("how many milles per galons your car gets:");

        mpg = in.nextInt();
        in.nextLine();


        System.out.println("With gas at $" + gasPrice + " per gallon, going 100 miles will cost you $" + (gasPrice * 100) );

        System.out.println("Since your car's efficiency is " + mpg + " mpg and given that you have " +  gasInTank + " gallons in the tank, by my calculations you can go " + (int)(mpg * gasInTank) + " miles before you run out of gas.");




    }
}
