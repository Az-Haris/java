import java.util.Scanner;

public class max {
    public static void main(String[] args){
        int a, b, c;
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter 1st value = ");
            a = input.nextInt();
            System.out.print("Enter 2nd value = ");
            b = input.nextInt();
            System.out.print("Enter 3rd value = ");
            c = input.nextInt();
        }
        if(a>b && a>c) {
            System.out.print("Max is = "+a);
        } else if(b>a && b>c) {
            System.out.print("Max is = "+b);
        } else{
            System.out.print("Max is = "+c);
        }
    }
}
