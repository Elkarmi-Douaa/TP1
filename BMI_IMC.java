import java.util.Scanner;

public class BMI_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir la masse en kg : ");
        double masse = sc.nextDouble();
        System.out.print(" Veuillez saisir la taille en m  : ");
        double taille = sc.nextDouble();
        double imc = masse / (taille * taille);
        System.out.printf("IMC = %.2f%n", imc);
        sc.close();
    }
}















