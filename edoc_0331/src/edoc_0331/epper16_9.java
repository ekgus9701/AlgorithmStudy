package edoc_0331;
import java.util.*;
import java.io.*;
public class epper16_9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String[] strArr;
		str = br.readLine();	// "����(�ٹٲ�)"�� �������� �Է¹޽��ϴ�!
		strArr = str.split("");	
		
		String ans="";
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<strArr.length;i++) {
			
			if(i==strArr.length-1) { //������ �ε����� ��
				
				if(!(strArr[i].equals(strArr[i-1]))) {
					ans=ans.concat(strArr[i]);
					list.add(ans);
					break;
					
				}
				if(ans.length()==0) {
					list.add("");
					list.add("");
					System.out.println(list.toString());
					return;
				}
				if(strArr[i].equals(strArr[i-1])) {
					list.add("");
					break;
			}
				
				
					
			}
			if(i==0) {//ù �ε����� ��
				if(!(strArr[i].equals(strArr[i+1]))) {
					ans=ans.concat(strArr[i]);
					continue;
				}
				if(strArr[i].equals(strArr[i+1]))
						continue;
			}
			//�߰� �ε������϶�
			if(strArr[i].equals(strArr[i+1])||strArr[i].equals(strArr[i-1])) {
				if(ans.length()!=0) {
					list.add(ans);
					ans="";
					continue;
				}
				
				
			}
			if(!(strArr[i].equals(strArr[i+1]))&&!(strArr[i].equals(strArr[i-1]))) {
				ans=ans.concat(strArr[i]);
			}
			
		}
		System.out.println(list.toString());
		
		
		

	}

}
