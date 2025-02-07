import java.util.*;
public class IF_ELSE {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("You are not eligible for work");
        }else if(age>=18 && age<=60){
            System.out.println("You are eligible for work");
        }else{
            System.out.println("You are a senior citizen and you are eligible for Pension");
        }
        sc.close();
    }
    
}
