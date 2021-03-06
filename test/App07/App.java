public class App {
  public static void main(String[] args) {
	  
		welcome();
		loop : while (true) {
			displayMenu();
			int menuNo = Prompt.inputInt("메뉴를 선택하세요[1..3](0: 종료)");
			displayLine();

			switch (menuNo) {
			  case 0: break loop;
				case 1: BoardHandler.processList(); break;
				case 2: BoardHandler.processDetail(); break;
				case 3: BoardHandler.processInput(); break;
				default : System.out.println("메뉴 번호가 옳지 않습니다!");
			}
		
		displayBlankLine();
		}

		System.out.println("안녕히 가세요!");
		Promt.close();
	}

	static void welcome() {
	  System.out.println("[게시판 애플리케이션]");
		System.out.println();
		System.out.println("환영합니다!");
		System.out.println();
	}

	static void dilsplayMenu() {
		System.out.println("메뉴:");
		System.out.println("  1: 게시글 목록");
		System.out.println("  2: 게시글 상세보기");
		System.out.println("  3: 게시글 등록");
		System.out.println();
	}

	static void displayLine() {
		System.out.println("================================");
	}

	static void displayBlankLine() {
		System.out.println();
	}
}
