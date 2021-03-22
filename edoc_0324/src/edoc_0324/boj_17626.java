package edoc_0324;
//� �� i�� ������ �ش� i ���� ���� ��� ������ �� �� i - (������)�� �� �� �� ���� ���� �ؿ� 1�� ���� ��
//������� ��: ���� ������ ���� �������� �߿��� ���� ū �������� ���鼭 Ǯ�����ߴµ� �ݷʰ� �־���. ��� �ؾ������𸣰ھ ���۸��� ������ �޾Ҵ�.
import java.util.*;
import java.io.*;
public class boj_17626 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	 
	        int[] dp = new int[N + 1];
	        dp[1] = 1;
	 
	        int min = 0;
	        for (int i = 2; i <= N; i++) {
	            min = Integer.MAX_VALUE;
	            
	            for (int j = 1; j * j <= i; j++) {
	                int temp = i - j * j;
	                min = Math.min(min, dp[temp]);  //4�� ��쿣 dp[0]�� min(dp[3])�� �� 
	            }
	 
	            dp[i] = min + 1; 
	        }
	 }
	 
}
