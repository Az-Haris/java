import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a, b, sum;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            a = input.nextInt();
            System.out.print("Enter the second number: ");
            b = input.nextInt();
        }
        sum = a + b;
        System.out.print("Summation is = " + sum);
    }
}
// import java.util.Scanner;

// public class Add {
//     public static void main(String[] args) {
//         int a, b, sum;
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         a = input.nextInt();
//         System.out.print("Enter the second number: ");
//         b = input.nextInt();
//         sum = a + b;
//         System.out.print("Summation is = " + sum);
//     }
// }
