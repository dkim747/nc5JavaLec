package chap999_homework_2023_03_24;

import java.util.Scanner;

public class advance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세용");
        StringBuilder strb = new StringBuilder(sc.next());
       
        for(int i = 0; i<strb.length()-1; i++){ //-1을 쓴 이유는 배열의 마지막값은 다음 비교할 수가 없기떄문에 마지막의 전까지만 비교한다.
            if(strb.charAt(i)==strb.charAt(i+1)){
                strb.deleteCharAt(i+1);
                i--; //i--를 쓴 이유는 만약에 다음 숫자가 똑같다면 그 숫자가 없어지고 그다음 숫자가 나와야하는데 --가 없으면 없어진 숫자와 비교하게 됌
            }
        }
        System.out.println(strb);
    }
}
