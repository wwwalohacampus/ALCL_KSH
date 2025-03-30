package Chap02.Ex07_추상클래스;

public class Circle extends Shape {

  double radius;      // 반지름

  public Circle() {
    this(0);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  double round() {
    return 2 * Math.PI * radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + "]";
  }

  

  
}
