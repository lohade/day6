import java.util.Scanner;

public class Perfect {

    static void perfect_number(int number){
        int i,sum=0;
        for(i=1;i<=number/2;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(number==sum){
            System.out.println(number+"is perfect number");
        }
        else{
            System.out.println(number+"is not perfect number");
        }
    }

    public static void main(String[] args){

        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        perfect_number(number);

    }




}
