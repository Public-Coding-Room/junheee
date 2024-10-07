
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Josephus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = (Integer)sc.nextInt(); // N 명의 사람
        int K = (Integer)sc.nextInt(); // K 번째 사람이 삭제

        Queue<Integer> q = new LinkedList<>(); // 큐 생성
        List<Integer> result = new ArrayList<>(); // 나중에 결과를 보여줄 ArrayList

        // 위에서 생성된 큐에 1~N까지의 값 삽입
        for (int i = 1; i <= N; i++) {
            q.offer(i); //offer 는 큐에 값을 입력하는 메서드이다.
        }
        
        while(!q.isEmpty()){ // q 안에 값이 없을 때까지 실행
            for(int i = 0; i<K; i++){
                if(i == K-1) // 만약 i 가 K -1 이랑 같다면 ex> K = 3, i = 3 -> 결과들을 누적할 ArrayList 에 q 의 헤드 값을 추가한다.
                    result.add(q.poll());
                else{ 
                    q.offer(q.poll()); 
                }
            }
        }

        System.out.print(" < ");

        for (int i=0; i<N-1; i++){ //삭제된 값 출력문
            System.out.print(result.remove(0) + " , ");
        }

        System.out.print(result.remove(0) + " > ");
    }

}
