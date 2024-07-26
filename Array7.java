import java.util.Scanner;
public class array7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0 ;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                int target = arr[i];
                boolean[] dp = new boolean[target+1];
                dp[0]=true;
                 for(int j = 0;j<n;j++)
                 {
                    if(j==i)
                    {
                        continue;
                    }
                    for(int k=target;k>=arr[j];k--)
                    {
                        dp[k]=dp[k]||dp[k-arr[j]];
                        System.out.println(dp[k]);
                    }
                 }
                  if(dp[target])

                  {
                    System.out.print("1 ");
                  }
                  else
                  {
                    System.out.print("0 ");
                  }
        }
        System.out.println();
    }
    sc.close();
}
}