package edoc_0310;
import java.util.*;
public class epper11_9 {
	public static int func(int left, int right) { 
		if (left == 0 && right == 0) //�� �� ���� ���Ÿ� 1 ��ȯ
			return 1;
		else {
			if (left == 0) //���� ��ȣ �� ���� �����ʸ� ���
				return 1;
			else if (left < right) //��� ��Ȳ���� ������ ��ȣ�� ���� ��ȣ���� ���ų� ���ƾ� ¦ ����
				return func(left - 1, right) + func(left, right - 1);
			else //���� ��ȣ�� ������ ��ȣ�� ���� ���� ���.
				return func(left - 1, right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(func(n,n));
		
	}

}

