import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bj1388 {
   
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 바닥 장식 행의 수 
        int m = Integer.parseInt(st.nextToken()); // 바닥 장식 열의 수
        int result = 0; // 결과 값을 누적하기 위한 변수 초기화
        char [][] room = new char [n][m]; // 사용자로부터 입력받는 바닥 장식을 저장하기 위한 2차원 배열


        // 방 크기 (n*m) 만큼 크기를 가지는 바닥 장식 입력받기
        for (int i=0; i<n; i++){
            String s = br.readLine(); 
            for (int j=0; j<m; j++){
                room [i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i<n; i ++){
            for (int j = 0; j<m; j++){
                if (i != 0 && room[i][j] == '|' && room[i-1][j] == '|'){
                    continue;
                }else if (j !=0 && room [i][j] == '-' && room[i][j-1] == '-'){
                    continue;
                }
                result++;
            }
            
        }
        System.out.println(result);
    

    }
}
