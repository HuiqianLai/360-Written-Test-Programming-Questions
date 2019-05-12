import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
int n,m;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
m = sc.nextInt();
    int[] nums = new int[100000+5];
    for(int i=0;i<n;i++){
    	nums[i] = sc.nextInt();
    }
    for(int i=0;i<m;i++){
    	int t,x;
    	t = sc.nextInt();
    	x = sc.nextInt();
    	Arrays.sort(nums,0,x);
        if(t==1){
    	for(int j=0;j<x/2;j++){
    	int cmp = nums[j];
    	nums[j] = nums[x-j-1];
    	nums[x-j-1] = cmp;
    	}
    	}
    }
    System.out.print(nums[0]);
    for(int i=1;i<n;i++){
    	System.out.print(" "+nums[i]);
    }
}
}