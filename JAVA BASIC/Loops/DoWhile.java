import java.util.*;
public class DoWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=num);
        sc.close();
        
    }
    
}
echo "# Java-Development" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Rohanchaursiya/Java-Development.git
git push -u origin main
