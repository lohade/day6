import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start time:");
        int a=sc.nextInt();
        long start=System.currentTimeMillis();
        System.out.println("enter end time:");
        int b= sc.nextInt();
        long end=System.currentTimeMillis();
        long elapsed=((end-start));
        System.out.println("Elapsed time is:" +elapsed );


    }
}
