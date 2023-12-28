import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int m = num;
        int sum = 0;
        while (num != 0){
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        if (m >= 0){
            System.out.println("Sum of the digit is "+sum);
        } else {
            System.out.println("Sum of the digit is "+(-sum));
        }
    }
}
