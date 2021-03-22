package edoc_0310;

import java.util.*;
 
class Word implements Comparable<Word>{
    String word;
    int count; //������ Ƚ��
    
    public Word(String word) {
        this.word = word;
        this.count = 0;
    }
 
    @Override
    public int compareTo(Word o) {
        // ���� Ƚ���� ���� ������ �����ϵ�, ���� Ƚ���� ���ٸ� ���ĺ� ������ ����
        if (this.count == o.count) // ���� Ƚ���� ���ٸ� ���ĺ� ������ ����
            return this.word.compareTo(o.word);
        else 
        	return this.count - o.count;
    }
}
 
public class epper14_5 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n;
        String word, find;
        Word ans;
 
        // 'a'���� 'z'���� �� ���ڷ� �����ϴ� �ܾ ���� priorityQueue�� ���� ����.
        List<PriorityQueue<Word>> queue = new LinkedList<>();
        for(int i=0; i<('z'-'a'+1); i++)
            queue.add(new PriorityQueue<>());
        
        
        k = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();
 
        
        for(int i=0; i<k; i++){
            // �Է¹��� ���ڷ� Word �ν��Ͻ� ���� ��, �´� PriorityQueue(get(word.charAt(0)-'a'))�� ���(add).
            word = sc.nextLine();
            queue.get(word.charAt(0)-'a').add(new Word(word));
        }
 
      
        for(int i=0; i<n; i++){
            find = sc.nextLine();
            
            // �ش� ���ڷ� �����ϴ� �ܾ� �� ���� �켱�ΰ� ������ ����ϱ�
            ans = queue.get(find.charAt(0)-'a').poll();
            System.out.println(ans.word);
            
            // �ѹ� ���������Ƿ�, count ������Ű�� �ٽ� queue�� �ֱ�.
            ans.count++;
            queue.get(find.charAt(0)-'a').add(ans);
        } 
    }
}