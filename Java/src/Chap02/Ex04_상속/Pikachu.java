package Chap02.Ex04_상속;

public class Pikachu {
  
  // 변수
  public int energy;
  public String type;
  
  // 생성자
  public Pikachu() {
    this(100, "전기");
    // energy = 100;
    // type = "전기";
  }

  public Pikachu(int energy) {
    this.energy = energy;
  }

  public Pikachu(int energy, String type) {
    this.energy = energy;
    this.type = type;
  }

  // 메소드
  public String aAttack() {
    return "십만볼트";
  }

  public String bAttack() {
    return "전광석화";
  }

  /**
   * toString() 
   * : 반환하는 문자열을 객체의 출력으로 대체해주는 메소드
   */
  @Override
  public String toString() {
    return "Pikachu [energy=" + energy + ", type=" + type + "]";
  }


  
}
