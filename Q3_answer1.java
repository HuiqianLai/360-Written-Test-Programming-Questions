import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[]=new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=sc.nextInt();
        }
        int b[]=new int[N];
        for(int i=0;i<N;i++){
            b[i]=i+1;
        }
        //最多转N次
        int res = Integer.MAX_VALUE;
        int p=0;
        while(p++<N){
            int sum=0;
            for(int i=0;i<N;i++){
                sum+=(Math.abs(a[(i+p)%N]-b[i]));
            }
            if(sum<res) res=sum;
        }
        System.out.println(res);
    }
}

