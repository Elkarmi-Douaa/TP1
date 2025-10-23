import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("veuillez saisir un nombre  : ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println(n + "! donne :  " + fact);
        sc.close();
    }
}














