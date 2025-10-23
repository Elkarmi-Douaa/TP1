import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int X = sc.nextInt();
        int etape = 0;
        while (X != 1) {
            if (X % 2 == 0)
                X /= 2;
            else
                X = 3 * X + 1;
            etape++;
            System.out.print(X + " ");
        }

        System.out.println("\n Nombre d’étapes : " + etape);
        sc.close();
    }
}
