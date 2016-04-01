import java.util.ArrayList;
import java.util.Collections;

public class FoodStoreService {
	private ArrayList<FoodStore> storeList;
	
	public FoodStoreService(){
		storeList=new ArrayList<FoodStore>();
	}
	
	// 음식점 정보 추가 
	public void addFoodStore(FoodStore newStore){
		storeList.add(newStore);
	}
	//
	public ArrayList<String> findByPosition(String city){
		ArrayList<String> result=new ArrayList<String>();
		for (FoodStore store :storeList){
			result.add(store+"."+store.toString());
		}
		Collections.sort(result);
		return result;
	} 
	
	public ArrayList<String> findByMenu(String menu){
		ArrayList<String> result=new ArrayList<String>();
		for (FoodStore store:storeList){
			if(store.checkMenu(menu)){
				result.add(store.toString());
			}
		}
		
		Collections.sort(result);
		return result;
	}
	
}
