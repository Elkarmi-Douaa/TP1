import java.util.Scanner;

public class sommede1aN_for{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" veuillez saisir un nombre : ");
        int a = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= a ; i++) {
            somme += i;
        }

        System.out.println("Somme de 1 à " + a + " donne :  " + somme);
        sc.close();
    }
}







 