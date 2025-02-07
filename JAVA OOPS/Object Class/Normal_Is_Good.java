import java.util.*;

public class Normal_Is_Good {
    public static long ZeroSum(int n,int a[]){
        HashMap<Integer,Long> hm=new HashMap<>();
        hm.put(0,1L);
        long count=0;
        int pre_sum=0;
        for(int i : a){
            pre_sum+=i;
            count+=hm.getOrDefault(pre_sum,0L);
            hm.put(pre_sum,hm.getOrDefault(pre_sum,0L)+1);
        }
        return count;
    }
    public static long ZeroSumWOZero(int n,int a[]){
        HashMap<Integer,Long> hm=new HashMap<>();
        hm.put(0,1L);
        long count=0;
        int pre_sum=0;
        for(int i : a){
            if(i==0){
                pre_sum=0;
                hm=new HashMap<>();
                hm.put(0,1L);
            }else{
                pre_sum+=i;
                count+=hm.getOrDefault(pre_sum,0L);
                hm.put(pre_sum,hm.getOrDefault(pre_sum,0L)+1);
            }
        }
        return count;
    }
    public static long CountConsecutive(int num,int a[]){
        long ans=0;
        int count=0;
        for(int i : a){
            if(i==num){
                count++;
            }else{
                ans+=((long)(count*(count+1)))/2;
                count=0;
            }
        }
        ans+=((long)(count*(count+1)))/2;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()-2;
        }
        int c=0;
        c+=CountConsecutive(1, a);
        c+=CountConsecutive(-1, a);
        c+= ZeroSum(n, a) - ZeroSumWOZero(n, a);
        System.out.println(c);
    }    
}
