import java.util.Scanner;

public class Reverse {

    static void reverse(int number){
        int rem,reverse_number=0;
        while(number!=0){
            rem=number%10;
            reverse_number=reverse_number*10+rem;
            number=number/10;
        }
        System.out.println("reverse number is:"+reverse_number);

    }
    public static void main(String[] args){
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        reverse(number);


    }
}
