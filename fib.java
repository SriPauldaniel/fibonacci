# fibonacci
public class fib
{
  public static void main(String[] args)
  {
    int n=10,i,j=10;
    System.out.println("Printing the first"+n+"series of fibbonacci numbers\n");
    for(i=0;i<=n;i++)
    {
      System.out.println(fib(j)+"\t");
      j++;
    }
  }
  public static int fib(int n)
  {
    if(n==0)
      return 0;
    else
      if(n==1)
        return 1;
    else
      return(fib(n-1)+fib(n-2));
  }
}
      
    
