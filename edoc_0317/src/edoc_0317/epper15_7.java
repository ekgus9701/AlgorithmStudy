package edoc_0317;
import java.util.*;

public class epper15_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		int e[]=new int[n];
		
		for(int k=0;k<n;k++) {
			s[k]=sc.nextInt();
		}
		for(int k=0;k<n;k++) {
			e[k]=sc.nextInt();
		}
		
		int time[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			
			time[i][0]=e[i]; //�����½ð�
			time[i][1]=s[i]; //���۽ð�
		}
		//�������� ����
		Arrays.sort(time, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                	 return o1[1] - o2[1];
		    	 }else {
		    		 return o1[0] - o2[0]; 
		    	 }
	           }
	        });
		//�� �������� �Ƴ� �����
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(time[i][j] + " ");
			}
			System.out.println();
		}
		
		int a1=0,a2=0; int b=0;
		
		for(int i=0;i<time.length;i++) {
			if((time[i][1]>=a1&&time[i][1]>=a2)) { //a1,a2�� �ɾ��ִ¾��� �����½ð����� ���ο� ���� ���۽ð��� �ڶ��
				//���ο� ���� ���۽ð��� a1,a2�� �ɾ��ִ� ���� ������ �ð��� ���ؼ� ���̰� ������ �ְ� �ɾ��ִ� ���ڿ� ������.
				if(time[i][1]-a1>time[i][1]-a2) {
					a2=time[i][0];
					b++;
				}
				else if(time[i][1]-a1<time[i][1]-a2) {
					a1=time[i][0];
					b++;
				}
				else if(time[i][1]-a1==time[i][1]-a2) { //���̰� ���ٸ� �׳� a1���ڿ� ������.
					a1=time[i][0];
					b++;
				}
			
			}
			
			else if(time[i][1]>=a1){//a1�� �ɾ��ִ¾��� �����½ð����� ���ο� ���� ���۽ð��� �ڶ��
				a1=time[i][0]; //���ο� �ָ� a1���ڿ� ������.
				b++;
			}
			else if(time[i][1]>=a2){//a2�� �ɾ��ִ¾��� �����½ð����� ���ο� ���� ���۽ð��� �ڶ��
				a2=time[i][0];//���ο� �ָ� a2���ڿ� ������.
				b++;	
			}
		}
		System.out.println(b);
		
	}

}
