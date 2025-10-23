import java.util.Scanner;

public class Max3nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir le premier nombre   a : "); int a = sc.nextInt();
        System.out.print("veuillez saisir  le deuxieme nombre b : "); int b = sc.nextInt();
        System.out.print("veuillez saisir le troisieme nombre c : "); int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand parmi ces trois est : " + max);
        sc.close();
    }
}
 











    

