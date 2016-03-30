
public class FoodStore {
	
	private String name; //가게 이름 
	private String city; //지역 
	private String dong; //동 
	private String foodType; // 음식 종류 
	private String menu; 
	private int maxPrice; //가장 비싼 음식 가격 
	private int minPrice;//가장 저렴한 음식 가격  
	
	@Override
	public String toString() {
		return "FoodStore [name=" + name + ", city=" + city + ", dong=" + dong + ", foodType=" + foodType + ", menu="
				+ menu + ", maxPrice=" + maxPrice + ", minPrice=" + minPrice + "]";
	}
	public FoodStore( String name,String city,String dong,String foodType,int maxPrice,int minPrice) {
		// TODO Auto-generated constructor stub
		super();
		this.city=city;
		this.dong=dong;
		this.foodType=foodType;
		this.name=name;
		this.maxPrice=maxPrice;
		this.minPrice=minPrice;
	}
	
	//가게에 메뉴가 존재하는지 확인
	 public boolean checkMenu(String keyword){
		 
		 if(this.menu.indexOf(keyword)>=0){
			 return true;
		 }
		 return false;
	 }
	

}
