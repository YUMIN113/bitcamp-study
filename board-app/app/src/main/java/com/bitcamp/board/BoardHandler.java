/*
 * 게시글 메뉴 처리 클래스
 */
package com.bitcamp.board;

public class BoardHandler {

  static int boardCount = 0; // 저장된 게시글의 개수

  static final int SIZE = 3;

  static int[] no = new int[SIZE];
  static String[] title = new String[SIZE];
  static String[] content = new String[SIZE];
  static String[] writer = new String[SIZE];
  static String[] password = new String[SIZE]; // 별도로 지정해 주는 이유는 블럭 실행하고 나면 변수 사라지기 때문임(62,63,65 Line)
  static int[] viewCount = new int[SIZE]; //69번에 조회수 출력하기 위해서 변수 선언과 반드시 초기화 해야 함
  static long[] createdDate = new long [SIZE];
  

  static void processList() {
    // 날짜 정보에서 값을 추출하여 특정 포맷의 문자열로 만들어줄 도구를 준비
    java.text.SimpleDateFormat formatter =
      new java.text.SimpleDateFormat("yyyy-MM-dd");

    System.out.println("[게시글 목록]");
    System.out.println("번호 제목 조회수 작성자 등록일");
      
     
    for (int i = 0; i < boardCount; i++) {
      // 밀리초 데이터 ==> Date 도구함으로 날짜 정보를 설정
      java.util.Date date  = new java.util.Date(createdDate[i]);
      
      // 날짜 정보 ==> "yyyy-MM-dd" 형식의 문자열
      String dateStr = formatter.format(date);

      System.out.printf("%d\t%s\t%d\t%s\t%s\n",
          no[i], title[i], viewCount[i], writer[i], dateStr);

      }
  }

  static void processDetail() {
    System.out.println("[게시글 상세보기]");

    int boardNo = Prompt.inputInt("조회할 게시글 번호? ");
      
    // 해당 번호의 게시글이 몇 번 배열에 들어 있는지 알아내기
    int boardIndex = -1;
    for (int i = 0; i < boardCount; i++) {
      if (no[i] == boardNo) {
        boardIndex = i;
        break;
      }
    }
      
    // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면
    if (boardIndex == -1) {
      System.out.println("해당 번호의 게시글이 없습니다!");
      return; // continue 는 메서드에서 return 으로 바꿔야 함.
   }
  
    
    System.out.printf("번호: %d\n", no[boardIndex]);
    System.out.printf("제목: %s\n", title[boardIndex]);
    System.out.printf("내용: %s\n", content[boardIndex]);
    System.out.printf("조회수: %d\n", viewCount[boardIndex]);
    System.out.printf("작성자: %s\n", writer[boardIndex]);
    java.util.Date date  = new java.util.Date(createdDate[boardIndex]);
    System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);

  }  
      // Date 도구함의 도구를 쓸 수 있도록 데이터를 준비시킨다.
      // new Date(밀리초)
      // = > 지정한 밀리초를 가지고 날짜 관련 도구를 사용할 수 있도록 설정한다.
      // Date date 
      // = > createdDate 밀리초를 가지고 설정한 날짜 정보
  

      // Date 도구함을 통해 설정한 날짜 정보를 가지고 printf()를 실행한다.
      // %tY : Date에 설정된 날짜 정보에서 년도만 추출한다.
      
  

  static void processInput() {
    System.out.println("[게시글 등록]");

    // 배열의 크기를 초과하지 않았는지 검사한다
    if (boardCount == SIZE) {
      System.out.println("게시글을 더이상 저장할 수 없습니다.");
      return;
    }

      
    title[boardCount] = Prompt.inputString("제목? ");
    content[boardCount] = Prompt.inputString("내용? ");
    writer[boardCount] = Prompt.inputString("작성자? ");
    password[boardCount] = Prompt.inputString("암호? ");
      
      // if (boardCount == 0) {
      //   no[boardCount] = 1;    
      // } else {
      //   no[boardCount] = no[boardCount-1]+1;
      // }  

    no[boardCount] = boardCount == 0 ? 1 : no[boardCount-1]+1; //조건연산자

    viewCount[boardCount] = 0;
    createdDate[boardCount] = System.currentTimeMillis();

    boardCount++;
  }
}  
