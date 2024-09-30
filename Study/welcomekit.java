package Study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class welcomekit {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // buffer 사용
        //펜의 갯수 입력받기 (BufferedReader 를 사용해 입력값을 받고, Int 값으로 저장)
        int M = Integer.parseInt(br.readLine()); // 전체 참가자 수 입력 받기

        String str = br.readLine(); // 문자열 입력 받기 (티셔츠 사이즈 별 신청자 수)
        String[] TsizeNum = str.split(" "); // TsizeNum 이라는 배열에 문자열 값을 잘라내기 해서 저장 (티셔츠 사이즈 별 신청자 수)
        str = br.readLine(); // 문자열 입력 받기 (티셔츠의 묶음 수, 펜의 묶음 수)
        String [] setNum = str.split(" "); // setNum 이라는 배열에 문자열 값을 잘라내기 해서 저장 (티셔츠의 묶음 수를 저장)

        int T = Integer.parseInt(setNum[0]); // T 라는 변수에 setNum[0] 값(티셔츠의 묶음 수) 을 저장 
        int Tnum = 0; // 반복문 안에서 사용하게 될 증감식 초기화

        for (int i = 0; i<6; i++){ // 6번 반복 (사이즈가 6 종류이기 때문)
            Tnum += (Integer.parseInt(TsizeNum[i]) / T); 
            // Tnum 은 각 사이즈 별 신청자 수를 T (티셔츠 묶음 수) 로 나눈 값의 몫을 저장하게 된다
            if ((Integer.parseInt(TsizeNum[i]) % T) != 0){ 
                // 각 사이즈 별 신청자 수를 티셔츠 묶음 수로 나눈 값이 0 으로 나누어 떨어지지 않는다면 Tnum을 1 씩 증가시킨다.
                Tnum++;
            }
        }
        System.out.println("티셔츠의 묶음 수 : " + Tnum);
        int P = Integer.parseInt(setNum[1]);

        System.out.println("펜의 묶음수: " +(M / P) + " " + "펜의 낱개 수" + (M % P));
    }
}
