import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int[] nums = new int[n+1];
int[] arrs = new int[n+1];
for(int i=0;i<n;i++){
nums[i] = sc.nextInt();
arrs[i] = i+1;
}
int mmin = 0;
for(int i=0;i<n;i++){
mmin += Math.abs(nums[i]-arrs[i]);
}
for(int i=1;i<n;i++){
int ans = 0;
for(int j=i;j<n;j++){
ans += Math.abs(nums[j]-arrs[j-i]);
}
int dis = n-1-i;
for(int j=0;j<i;j++){
ans += Math.abs(nums[j]-arrs[j+dis]);
}
if(ans<=mmin){
mmin = ans;
}
}
System.out.println(mmin);
}
}