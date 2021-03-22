package edoc_0324;
//���������: ��� �ؾ��� �� ���� �ȿԴ�. ���۸��� �����ߴ�. ��Ʈ��ŷ ������ ���� ������ �ʿ䰡 �־�δ�.
import java.util.Scanner;
 
public class boj_14888 {
 
	public static int MAX = Integer.MIN_VALUE;	// �ִ� 
	public static int MIN = Integer.MAX_VALUE;	// �ּڰ� 
	public static int[] op = new int[4];	// ������ ���� 
	public static int[] number;					// ���� 
	public static int n;						// ���� ���� 
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		n = sc.nextInt();
		number = new int[n];
 
		// ���� �Է�
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
 
		// ������ �Է�
		for (int i = 0; i < 4; i++) {
			op[i] = sc.nextInt();
		}
 
		dfs(number[0], 1); //���ȣ�� ����
 
		System.out.println(MAX);
		System.out.println(MIN);
 
	}
 
	public static void dfs(int num, int idx) {
		if (idx == n) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
 
		for (int i = 0; i < 4; i++) { // + - * /�� ������� �Ѵ�
			// ������ ������ 1�� �̻��� ���
			if (op[i] > 0) {
 
				// �ش� �����ڸ� 1 ���ҽ�Ų��.
				op[i]--;
 
				switch (i) {
 
				case 0:	dfs(num + number[idx], idx + 1);	break;
				case 1:	dfs(num - number[idx], idx + 1);	break;
				case 2:	dfs(num * number[idx], idx + 1);	break;
				case 3:	dfs(num / number[idx], idx + 1);	break;
 
				}
				// ���ȣ���� ����Ǹ� �ٽ� �ش� ������ ������ �����Ѵ�.
				op[i]++;
			}
		}
	}
 
}