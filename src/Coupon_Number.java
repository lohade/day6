import java.util.Scanner;
class Coupon_Number {
    public static int getCoupon(int n){
        int ran= (int)(Math.random()*n);
        return ran;
    }

    public static void main(String[] args){
        System.out.println("enter number to finding distinct number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] isCollected=new boolean[n];
        int count=0;
        int distinct=0;

        while(distinct<n){
            //System.out.println("Random" +getCoupon(n));
            int value=getCoupon(n);
            count++;
            if(isCollected[value]==false){
                distinct++;
                isCollected[value]=true;
            }
        }
        System.out.println("for find distinct value random function called:"+count +"times");
        System.out.println("");
    }
}
