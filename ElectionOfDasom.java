import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectionOfDasom {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println(" 전체 후보자의 수를 입력한 뒤, 각 후보자의 투표수를 입력하시오 ");
		int N = sc.nextInt(); //전체 후보자의 수 입력
		int Dasom = sc.nextInt(); //다솜이의 득표수 따로 받기
		Integer cd[] = new Integer[N-1]; // 이후 내림 차순 정렬을 받기 위해 Integer 타입의 배열 선언
		int sum = 0; //매수해야 하는 사람 수

		for(int i = 0; i < cd.length; i++){ // 다솜이의 투표수를 제외한 전체 후보자의 투표수를 입력받음
             cd[i] = sc.nextInt();
        }

		for (int j = 0; j < cd.length; j++) // 다솜이를 제외한 후보자들의 투표수를 비교하기 위한 반복문 
		{
			Arrays.sort(cd, Collections.reverseOrder()); // 다솜이를 제외한 후보자들의 투표수를 내림 차순 정렬
			if(N == 1 || cd[0] < Dasom) { 
                // 만약 전체 후보자가 다솜이 혼자이거나, 전체 후보자 중 가장 득표수가 많은 사람 (cd[0]) 이 다솜이보다 득표수가 낮다면 반복문 바로 중단
                break; 
            }   
			else 
			{
				Dasom++;
				cd[0]--;
				sum++;
                
			}
		}
        System.out.println("----------매수 투표 결과----------");
        System.out.println("다솜이의 투표수: " + Dasom);
        System.out.println("2번 ~ " + N + " 번 후보자의 투표수: "+  Arrays.toString(cd));
		System.out.println("다솜이가 매수해야할 투표수: " + sum);

    }

}
