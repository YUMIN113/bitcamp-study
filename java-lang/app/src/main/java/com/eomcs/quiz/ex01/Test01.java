package com.eomcs.quiz.ex01;

// [문제] 
// 파라미터로 주어진 정수 값을 2진수로 표현했을 때 1로 설정된 비트의 개수를 구하라!
// [훈련 목표]
// - 비교 연산자 및 비트 연산자 활용
// - 반복문 활용
// - 메서드 파라미터 및 리턴 값 다루기
//
public class Test01 {

  public static void main(String[] args) {
    int c = countBits(0b01100011);
    System.out.println(c == 4); // true

    c = countBits(0b01010111_01100011);
    System.out.println(c == 9); // true
  }

  static int countBits(int value) {
    int r = 0;
    
    while (value != 0) { // 0이 아니면 반복해라!
    r += (value & 1); // &1 / += 하게되면 계속 값이 더해짐 = count와 동일한 효과
    value >>>= 1; // > 세 개면 빈자리 모두 0으로 채운다
    }
    
    return r;
  }

}
// 중요한 것! : 비트 이동!
// 방식 : 끝에 1을 &하여 1을 찾는 방식 (비트 연산)
// 왼쪽 MSB(Most Significant Bit) // 오른쪽 LSB(Least Significant Bit)
