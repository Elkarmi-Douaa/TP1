import java.util.Scanner;
public class test_primalite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre  : ");
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println("le nombre n'est pas  premier");
        } else {
            int diviseur = 2;
            boolean premier = true;

            while (diviseur < a) {
                if (a % diviseur == 0) {
                    premier = false;
                    break;
                }
                diviseur++;
            }

            if (premier)
                System.out.println("le nombre est  premier");
            else
                System.out.println("le nombre n'est pas  premier");
        }

        sc.close();
    }
}






















