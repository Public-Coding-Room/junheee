import java.util.Scanner;

public class ElectionOfDasom {
    public static void main(String[] args) {
        
        System.out.println(" 전체 후보자 수와 각 후보자의 득표수를 입력하시오 ");

          Scanner sc = new Scanner(System.in);
       int N = sc.nextInt(); // 전체 후보자의 수 입력받기
    
       int [] cd = new int [N]; //N 명의 후보자 만큼 후보자를 입력받을 배열
       int sum = 0; // 매수를 위해 필요한 표의 수를 저장하기 위해 사용하는 변수

        for (int i = 0; i<cd.length; i++){ // 입력받은 전체 후보자의 수만큼 후보자의 득표수 입력받기
            cd[i] = sc.nextInt();
            
            for (int j = 1; j<cd.length; j++){

               if (cd[0] < cd[j] ){
                    cd[0] +=1;
                    cd[j] -=1;
                    sum ++;                     
                }else if ((cd[j] - cd[0]) ==1){
                    cd[0] +=1;
                    cd[j] -=1;
                    sum++;
                }
               
            }
                  
        }
        System.out.println("--------");

        for (int u =0; u<cd.length; u++){
            System.out.println(cd[u]);
        }
        System.out.println( "매수해야하는 표 수: "+ sum);
    }

}
