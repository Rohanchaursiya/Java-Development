import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void Code_By_Rohan() {
        int n=sc.nextInt();
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++){
            a[i]=sc.next().toCharArray();
        }
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i;j++){
                for(int k=i;k<n-i;k++){
                    char temp=a[j][k];
                    a[j][k]=a[k][n-1-j];
                    a[k][n-1-j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Code_By_Rohan();
    }
    

    

}