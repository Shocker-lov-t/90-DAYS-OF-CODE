import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
      Scanner sc=new Scanner(System.in);
      double n=sc.nextDouble();
      int x=sc.nextInt();
      System.out.print(x+" Root of "+n+" is: "+solution(n,x));

  }
  public static double solution(double n, int x){
      double left=1.0,right=n,error=0.001;
      while((right-left)>error){
          double mid=(left+right)/2.0;
          if(multipy(mid,x)>n){
              right=mid;
          }
          else{
              left=mid;
          }
      }
      return right;
  }
  public static double multipy(double mid,int x){
      double ans=1.0;
      for(int i=1;i<=x;i++){
          ans=ans*mid;
      }
      return ans;
}
}
