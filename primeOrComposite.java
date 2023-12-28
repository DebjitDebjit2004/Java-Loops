import java.util.Scanner;

public class primeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int f = -1;
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                f++;
                break; //break statement is used to terminate the loop
            }
        }
        if (f == -1){
            System.out.println("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}
