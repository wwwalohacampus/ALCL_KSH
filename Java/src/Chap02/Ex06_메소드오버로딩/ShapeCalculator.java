package Chap02.Ex06_메소드오버로딩;

public class ShapeCalculator {

  // 정사각형 넓이
  public double calculate(double side) {
    return side * side;
  }

  // 직사각형 넓이
  public double calculate(double width, double height) {
    return width * height;
  }

  // 원의 넓이
  public double calculate(double raidus, boolean isCircle) {
    if( isCircle )
      return Math.PI * raidus * raidus;
    return -1;
  }

  // 삼각형의 넓이
  public double calculate(double base, double height, String ShapeType) {
    if( "삼각형".equals(ShapeType) ) {
      return (base * height) / 2;
    }
    return -1;
  }
  

  public static void main(String[] args) {
    ShapeCalculator calculator = new ShapeCalculator();

    System.out.println("정사각형 넓이 : " + calculator.calculate(4));
    System.out.println("직사각형 넓이 : " + calculator.calculate(4, 5));
    System.out.println("원형 넓이 : " + calculator.calculate(3, true));
    System.out.println("삼각형 넓이 : " + calculator.calculate(4, 6, "삼각형"));
  }
  
  
}
