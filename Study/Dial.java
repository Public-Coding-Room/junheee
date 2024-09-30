package Study;

import java.util.*; 

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine(); // 알파벳으로 구성된 입력값 받기
        str = str.toUpperCase(); // 알파벳 전부 대문자로 변환
        
        int sum = 0;
        
        for (int i = 0; i<str.length(); i++){
            switch (str.charAt(i)) {
                    case 'A' : case 'B' : case 'C':
                        sum +=3;
                        break;
                    case 'D' : case 'E' : case 'F':
                        sum +=4;
                        break;
                    case 'G' : case 'H' : case 'I':
                        sum +=5;
                        break;
                    case 'J' : case 'K' : case 'L':
                        sum +=6;
                        break;
                    case 'M' : case 'N' : case 'O':
                        sum +=7;
                        break;
                    case 'P' : case 'Q' : case 'R': case 'S':
                        sum +=8;
                        break;
                    case 'T' : case 'U' : case 'V':
                        sum +=9;
                        break; 
                    case 'W' : case 'X' : case 'Y': case 'Z':
                        sum +=10;
                        break;   
                   
            }
        }System.out.println("다이얼을 돌리는 데 걸리는 시간: " + sum);
    }
}   

