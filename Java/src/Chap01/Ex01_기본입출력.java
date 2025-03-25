package Chap01;

import java.util.Scanner;

public class Ex01_기본입출력 {

  public static void main(String[] args) {
      // Scanner 객체 생성
      Scanner scanner = new Scanner(System.in);
      
      // 사용자로부터 정수 입력 받기
      System.out.print("정수를 입력하세요: ");
      int number = scanner.nextInt();
      
      // 입력 받은 정수 출력
      System.out.println("입력된 정수는 " + number + "입니다.");
      
      // Scanner 닫기
      scanner.close();
  }
  
}
