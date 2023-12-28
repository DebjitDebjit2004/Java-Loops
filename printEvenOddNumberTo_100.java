public class printEvenOddNumberTo_100 {
    public static void main(String[] args) {
        System.out.print("Even Numbers: ");
        for (int i = 2; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for (int i = 1; i <= 100; i+=2){
            System.out.print(i+" ");
        }
    }
}
