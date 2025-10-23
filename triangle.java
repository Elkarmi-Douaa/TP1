import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir le cote a : "); double a = sc.nextDouble();
        System.out.print("veuillez saisir le cote b : "); double b = sc.nextDouble();
        System.out.print("veuillez saisir le cote c : "); double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("c'est un triangle equilatéral");
            else if (a == b || a == c || b == c)
                System.out.println("c'est un triangle isocèle");
            else
                System.out.println("c'est un triangle scalène");
        } else {
            System.out.println("Ce n’est pas un triangle ");
        }
        sc.close();
    }
}
