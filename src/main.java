import Singleton.ShopList;

public class main {
	
	public static void main(String[] args){
	
		ShopList shopList = ShopList.getInstance();
        System.out.println(shopList.add("batata"));
        System.out.println(shopList.add("Food"));
        System.out.println(shopList.add("Foodhgdshgds"));
        System.out.println(shopList.add("Other"));
        System.out.println(shopList.add("batata"));
        System.out.println(shopList.ShopListSize());
        shopList.Food();
        shopList.Other();
    }

}


