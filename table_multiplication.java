import java.util.Scanner;

public class table_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir un nombre  : ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " × " + i + " = " + (x * i));
        }
        sc.close();
    }
}