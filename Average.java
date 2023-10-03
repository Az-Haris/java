import java.util.Scanner;

class Average{
    public static void main(String[] args){
        int a, b, c, avg;
        try (Scanner input= new Scanner(System.in)){
            System.out.print("Enter 1st number = ");
            a= input.nextInt();
            System.out.print("Enter 2nd number = ");
            b= input.nextInt();
            System.out.print("Enter 3rd number = ");
            c= input.nextInt();
        }
        avg = (a+b+c)/3;
        System.out.print("Average is = "+avg);

    }
}