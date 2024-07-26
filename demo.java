import java.util.Scanner;

public class demo {
    static final int MOD = 1000000007;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
            int N =3;
            long[] arr = {4,1,5};
            
            
            int Q = 3;
            long[] L = {1,3,9};
            long[] R ={4,7,10};
            
            
            long[] sum = new long[N + 1];
            sum[0] = 0;
            for (int i = 1; i <= N; i++) {
                sum[i] = (sum[i - 1] + arr[i]) % MOD;
            }
            
            for (int i = 0; i < Q; i++) {
                long result = (func(sum, R[i], N) - func(sum, L[i] - 1, N) + MOD) % MOD;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        
        
    }
    public static long func(long[] sum, long X, long N) {
        return (sum[(int)(X % N)] + (((X / N) % MOD) * sum[(int)N]) % MOD) % MOD;
    }
}
