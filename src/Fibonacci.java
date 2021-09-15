import java.util.Scanner;

public class Fibonacci {

    static void fibonacci(int number){
        int first=0;
        int second=1;
        int sum,i;
        System.out.println(first+" "+second);

        for(i=2;i<number;i++){
            sum=first+second;
            System.out.println(+sum);
            first=second;
            second=sum;
        }



    }
    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        fibonacci(number);
    }
}
