import java.util.Scanner;

public class somme2entiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier a : ");
        int a = sc.nextInt();
        System.out.print("Entrez le deuxieme entier b : ");
        int b = sc.nextInt();
        System.out.println("La somme des deux entiers donne : " + (a + b));
        sc.close();
    }
}