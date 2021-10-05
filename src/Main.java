import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double vat = 0.2;

        Scanner input = new Scanner(System.in);
        System.out.println("enter an amount, and i will tell you how much the government take");
        double money = input.nextDouble();
        double tax = money * vat;
        double HMRC = money - tax;
        System.out.println("you have £" + HMRC);
    }
}
