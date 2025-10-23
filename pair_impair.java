import java.util.Scanner;

public class pair_impair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre de votre choix : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("le nombre est Pair");
        else
            System.out.println("le nombre est Impair");
        sc.close();
    }
}
