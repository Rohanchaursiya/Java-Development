import java.util.Scanner;
public class WhileLoop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            System.out.println("Sum of 1 to "+i+" = "+sum);
            i++;
        }
        sc.close();
    }
}
