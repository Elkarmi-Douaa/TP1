import java.util.Scanner;

public class conversionCenF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("La température en Celsius est  : ");
        double c = sc.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.println("La empérature en Fahrenheit deviendra : " + f);
        sc.close();
    }
}







