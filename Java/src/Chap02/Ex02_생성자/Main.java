package Chap02.Ex02_생성자;

public class Main {

  public static void main(String[] args) {
    // Student 객체 생성
    Student student = new Student();
    student.name = "김철수";
    student.age = 22;
    student.major = "컴퓨터공학과";
    student.stdNo = "202500001";

    System.out.println(":::::::::: 학생1 ::::::::::");
    System.out.println("학생1 - 이름 : " + student.name);
    System.out.println("학생1 - 나이 : " + student.age);
    System.out.println("학생1 - 전공 : " + student.major);
    System.out.println("학생1 - 학번 : " + student.stdNo);
    System.out.println();


    Student student2 = new Student("홍길동", 30, "회계학과", "20250002");

    System.out.println(":::::::::: 학생2 ::::::::::");
    System.out.println("학생2 - 이름 : " + student2.name);
    System.out.println("학생2 - 나이 : " + student2.age);
    System.out.println("학생2 - 전공 : " + student2.major);
    System.out.println("학생2 - 학번 : " + student2.stdNo);
    System.out.println();
  }
  
}
