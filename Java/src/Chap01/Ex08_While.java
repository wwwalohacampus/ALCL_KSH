package Chap01;

public class Ex08_While {
  
  public static void main(String[] args) {
    // 1~10 까지 공백을 두고 출력하시오.
    // 1 2 3 4 5 6 7 8 9 10
    int a = 1;

    while ( a <= 10 ) {
      System.out.print(a++ + " ");
      // a = a + 1;
      // 복합 대입 연산자
      // a += 1;
      // 증감 연산자
      // a++;
    }
    
  }

}
