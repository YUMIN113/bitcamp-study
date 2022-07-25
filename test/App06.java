public class App06 {

	static int boardCount = 0; 
	
	static final int SIZE = 3; 

	static int[] no = new int[SIZE];
	static String[] title = new String[SIZE];
	static String[] content = new String[SIZE];
	static String[] writer = new String[SIZE];
	static String[] password = new String[SIZE];
	static int[] viewCount = new int[SIZE];
	static long[] createdDate = new long[SIZE];

	static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

	public static void main(String[] args) { 
		welcome();
		loop: while (true) {
      displayMenu();
			int menuNo = promptMenu();
			displayLine();

			switch (menuNo) {
				case 0: break loop;
				case 1: processBoardList(); break;
				case 2: processBoardDetail(); break;
				case 3: processBoardInput(); break;
				default: System.out.println("메뉴 번호가 옳지 않습니다!");
			}
			displayBlankLine();
		}
		  System.out.println("안녕히 가세요!");
			keyboardInput.close();

	}

	static void welcome() {
		System.out.println("[게시판 애플리케이션]");
		System.out.println();
		System.out.println("환영합니다!");
		System.out.println();
	}

	static void processBoardList() {
		java.text.SimpleDateFormat formatter = 
		  new java.text.SimpleDateFormat("yyyy-MM-dd");

		System.out.println("[게시글 목록]");
		System.out.println("번호 제목 조회수 작성자 등록일");

		for (int i = 0; i < boardCount; i++) {
			java.util.Date date = new java.util.Date(createdDate[i]);

			String dateStr = formatter.format(date);

			System.out.printf("%d\t%s\t%d\t%s\t%s\n",
			  no[i], title[i], viewCount[i], writer[i], dateStr);
		}
	}


	static void processBoardDetail() {
		System.out.println("[게시글 상세보기]");

		System.out.print("조회할 게시글 번호? ");
		String input = keyboardInput.nextLine();
		int boardNo = Integer.parseInt(input);

    int boardIndex = -1;
		for (i = 0; i < boardCount; i++) {
			if (no[i] == boardNo) {
				boardIndex = i;
				break;
			}
		}
      if (boardIndex == -1) {
				System.out.println("해당 번호의 게시글이 없습니다!");
				return;
			}

			System.out.printf("번호: %d\n", no[boardIndex]);
			System.out.printf("제목: %s\n", title[boardIndex]);
			System.out.printf("내용: %s\n", content[boardindex]);
			System.out.printf("조회수: %s\n", viewCount[boardIndex]);
			System.out.printf("작성자: %s\n", writer[boardIndex]);
			java.util.Date date = new java.util.Date(createdDate[boardIndex]);
			System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);

	}

	  static void processBoardInput() {
			System.out.println("[게시글 등록]");

			if (boardCount == SIZE) {
				System.out.println("게시글을 더이상 저장할 수 없습니다.");
				return;
			}
      
			System.out.print("제목? ");
			title[boardCount] = keyboardInput.nextLine();

			System.out.print("내용? ");
			content[boardCount] = keyboardInput.nextLine();

			System.out.print("작성자? ");
			writer[boardCount] = keyboardInput.nextLine();

			System.out.print("암호? ");
			password[boardCount] = keyboardInput.nextLine();

			no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;

			viewCount[boardCount] = 0;
			createdDate[boardCount] = System.currentTimeMillis();

			boardCount++;

		}
		static void displayMenu() {
			System.out.println("메뉴:");
			System.out.println("  1: 게시글 목록");
			System.out.println("  2: 게시글 상세보기");
			System.out.println("  3: 게시글 등록");
			System.out.println();
			System.out.print("메뉴를 선택하세요[1..3](0: 종료)");

		static void displayLine() {
			System.out.println("=================================");
	  }
		static int promptMenu() {
			int menuNo = keyboardInput.nextInt();
			keyboardInput.nextLine();
			return menueNo;

		}

		static void displayBlankLine() {
			System.out.println();
	
		
		}
}
