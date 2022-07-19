package com.eomcs.oop.ex02;

// # 사용자 정의 데이터 타입
// 1) t
public class Exam0110 {

  public static void main(String[] args) {
    // 사용자 정의 데이터 타입 만들기
    // 학생의 성적 데이터를 담을 메모리(변수)를 설계한다.
    Score s1 = new Score();

    // - 클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.average = s1.sum / 3f;

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math,
        s1.sum, s1.average);
  }
}

// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
// 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
// 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.


