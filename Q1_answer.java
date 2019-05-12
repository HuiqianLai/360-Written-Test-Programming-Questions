import java.util.*;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
int T;
Scanner sc = new Scanner(System.in);
T = sc.nextInt();
for(int i=0;i<T;i++){
int[] arrs = new int[5];
for(int k=1;k<=4;k++){
arrs[k] = sc.nextInt();
}
int ans = 0;
ans += arrs[4];//全部的队伍
ans += arrs[2]/2;//二人合并组队
ans += arrs[1]<=arrs[3] ? arrs[1]:arrs[3];//1,3合并组队
int left_1 = arrs[1]-arrs[3];
int left_2 = arrs[2]%2;
while(left_1>=2&&left_2>=1){
ans++;
left_1 = left_1 - 2;
left_2 = left_2 - 1;
}
while(left_1>=4){
ans++;
left_1 = left_1 -4;
}
System.out.println(ans);
}
}
}