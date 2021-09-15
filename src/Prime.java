import java.util.Scanner;

public class Prime {


    static void prime(int n){
        int m,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println("not a  prime number");
        }
        else if(n==2){
            System.out.println(n+"prime number");
        }
        else{
            for(int i=2;i<m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(n + "is prime number");
            }
        }
    }




    public static void main(String[] args) {
	// write your code here
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);


    }
}
