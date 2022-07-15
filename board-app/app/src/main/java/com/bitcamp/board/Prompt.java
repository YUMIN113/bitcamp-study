/*
 * 키보드 입력을 받는 도구를 구비하고 있다.
 */
package com.bitcamp.board;

public class Prompt {

  static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

  static int inputInt() {
    String str = keyboardInput.nextLine(); // 창에 숫자 입력하고 엔터치면 nextInt가 menuNo에 숫자만 보냄. 엔터 값은 여전히 남아있는 상태
    return Integer.parseInt(str); 
  }  
  static int inputInt(String title) {
    System.out.print(title);
    String str = keyboardInput.nextLine(); // 창에 숫자 입력하고 엔터치면 nextInt가 menuNo에 숫자만 보냄. 엔터 값은 여전히 남아있는 상태
    return Integer.parseInt(str); 
  }  
    static String inputString() {
      return keyboardInput.nextLine();
  }

    static String inputString(String title) {
      System.out.print(title);
      return keyboardInput.nextLine();
  }  
    static void close() {
      keyboardInput.close();
  }
}  



