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
    this("이름없음", 0);
    // this.name = "이름없음";
    // this.age = 0;
    // this.stdNo = "0000000";
    // this.major = "전공없음";
  }

  public Student(String name, int age) {
    this( name, age, "0000000", "전공없음" );
    // this.name = name;
    // this.age = age;
    // this.stdNo = "0000000";
    // this.major = "전공없음";
  }

  // 매개변수 있는 생성자
  public Student(String name, int age, String stdNo, String major) {
    this.name = name;
    this.age = age;
    this.stdNo = stdNo;
    this.major = major;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", stdNo=" + stdNo + ", major=" + major + "]";
  }

  
  
}
