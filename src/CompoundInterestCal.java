import java.util.Scanner;

public class CompoundInterestCal{

    public static void main(String[] args){

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int compoundFrequency;
        int years;
        double amount;

        System.out.println();
        System.out.println("----------------Enter the Following Data----------------");
        System.out.println();



        System.out.print("Principal amount(in Rs)             :");
        principal = scanner.nextDouble();

        System.out.print("Interest rate (in %)                :");
        rate = scanner.nextDouble() / 100;

        System.out.print("Number of times compounded for year :");
        compoundFrequency = scanner.nextInt();

        System.out.print("Number of years                     :");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/compoundFrequency , compoundFrequency * years);

        System.out.println();

        System.out.println("--------------------------------------------------------");
        System.out.printf("The Total amount after %d years is   :Rs.%.2f  \n",years,amount);
        System.out.println("--------------------------------------------------------");

        scanner.close();

    }

}
