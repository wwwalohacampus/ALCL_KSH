package Chap02.Ex02_생성자;

// 학생
// - 변수     : 이름, 나이, 학번, 전공
// - 메소드   : 공부하기, 성적 평균 구하기
public class Student {

  // 변수
  String name;
  int age;
  String stdNo;
  String major;

  // 기본 생성자
  public Student() {
    name = "이름없음";
    age = 0;
    stdNo = "00000000";
    major = "전공없음";
  }

  // 매개변수 있는 생성자
  public Student(String name, int age, String stdNo, String major) {
    this.name = name;
    this.age = age;
    this.stdNo = stdNo;
    this.major = major;
  }

  
  
}
