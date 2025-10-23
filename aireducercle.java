import java.util.Scanner;

public class aireducercle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer le rayon de votre cercle  : ");
        double r = sc.nextDouble();
        double aire = Math.PI * r * r;
        System.out.printf("L’aire de votre cercle est : %.2f%n", aire);
        sc.close();
    }
}

