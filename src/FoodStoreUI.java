import java.util.Scanner;

public class FoodStoreUI {
	
	Scanner s=new Scanner(System.in);
	private FoodStoreService service;
	public FoodStoreUI(){
		service=new FoodStoreService();
		showUsage();
	}
	public void showUsage(){
		System.out.println("맛집 찾기 프로그램");
		System.out.println("-----Meuu-----");
		System.out.println("1.맛집 추가 , 2. 위치로 찾기 , 3. 메뉴로 찾기, 4. 종료");
		
		int choice=s.nextInt();
		
		switch (choice) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
			
		default:
			break;
		}
		showUsage();
	}
	
	

}

