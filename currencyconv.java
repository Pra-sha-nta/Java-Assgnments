
import java.util.Scanner;

public class currencyconv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double usdToNpr = 125.90;
        double usdToInr = 75.04;
        double usdToYuan = 6.35;
        double usdToAud = 1.33;
        double NprTOUsd=0.0075;
        double NprTOInr=0.63;
        double NprTOAud=0.012;
        double NprTOYuan=0.054;


        System.out.println("____________Currency Converter____________");
        System.out.println("Available currencies:\n1.USD \n" +
                "2.NPR\n" +
                "3.INR\n" +
                "4.YUAN\n" +
                "5.AUD");
        System.out.print("Enter the currency you have (USD, NPR, INR, YUAN, AUD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        
        System.out.print("Enter the currency you want to convert to (USD, NPR, INR, YUAN, AUD): ");
        String toCurrency = scanner.next().toUpperCase();

        double result = 0;

        switch (fromCurrency) {
            case "USD":
                if (toCurrency.equals("NPR"))
                    result = amount * usdToNpr;
                else if (toCurrency.equals("INR"))
                    result = amount * usdToInr;
                else if (toCurrency.equals("YUAN"))
                    result = amount * usdToYuan;
                else if (toCurrency.equals("AUD"))
                    result = amount * usdToAud;
                else
                    result = amount;
                break;
            case "NPR":
                if (toCurrency.equals("USD"))
                    result = amount* NprTOUsd;

                else if (toCurrency.equals("INR"))
                    result = amount*NprTOInr;
                else if (toCurrency.equals("YUAN"))
                    result = amount * NprTOYuan;
                else if (toCurrency.equals("AUD"))
                    result = amount * NprTOAud;
                else
                    result = amount;
                break;

            default:
                System.out.println("CAN ONLY CONVERT FROM NEPALI AND US CURRENCIES. I'M SORRY!!");
                return;
        }

        System.out.println(amount + " " + fromCurrency + " is equal to " + result + " " + toCurrency);
    }
}