import java.util.Scanner;

public class arithmeticProgression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Total Number of Terms: ");
        int n = sc.nextInt();
        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();

        System.out.print("Series is: ");
        for (int i = 1; i <=n; i++){
            System.out.print(a+" ");
            a += d;
        }

    }
}
