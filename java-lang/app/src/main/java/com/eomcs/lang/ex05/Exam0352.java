package com.eomcs.lang.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기 응용 I
//
public class Exam0352 {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    // 57에서 2를 나눠 나머지가 0이 나오면 짝수이다.

    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");
    // 읽는 방법 : 57에서 맨 끝 1bit 추출하여 값이 0 일 때, 짝수이다.
    // 57 & 0x3 > 57에서 끝에서 2bit 추출해라
  }

}

