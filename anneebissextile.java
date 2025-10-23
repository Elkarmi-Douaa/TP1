import java.util.Scanner;

public class anneebissextile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une année de  votre choix  : ");
        int annee = sc.nextInt();

        boolean bissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
        if (bissextile)
            System.out.println("l'Année est bissextile");
        else
            System.out.println("l' Année n'est pas  bissextile");
        sc.close();
    }
}
