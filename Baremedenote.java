import java.util.Scanner;

public class Baremedenote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir une note : ");
        double note = sc.nextDouble();

        if (note >= 16) System.out.println("A");
        else if (note >= 14) System.out.println("B");
        else if (note >= 12) System.out.println("C");
        else if (note >= 10) System.out.println("D");
        else System.out.println("F");

        sc.close();
    }
}
