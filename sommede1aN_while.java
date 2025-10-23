import java.util.Scanner;

public class sommede1aN_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir un nombre  : ");
        int a = sc.nextInt();

        int somme = 0;
        int i = 1;
        while (i <= a) {
            somme += i;
            i++;
        }

        System.out.println("Somme de 1 à " + a + " donne  " + somme);
        sc.close();
    }
}

