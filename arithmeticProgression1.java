import java.util.Scanner;

public class arithmeticProgression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Total Number of Terms: ");
        int n = sc.nextInt();
        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();

        int an = a + (n - 1) * d;
        System.out.print("Series is: ");
        for (int i = a; i <= an; i+=d){
            System.out.print(i+" ");
        }
    }
}
