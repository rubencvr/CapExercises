package Singleton;

import java.util.ArrayList;
import java.util.List;

public class ShopList {
	private List<String> shoplist;

    private static ShopList instance = new ShopList();

    public ShopList(){
        shoplist = new ArrayList<>();

        if(instance != null){
            throw new RuntimeException("use getInstance");
        }
    }

    public static ShopList getInstance() {
        if(instance == null){
            synchronized (ShopList.class){
                if(instance == null){
                    instance = new ShopList();
                }
            }
        }
        return instance;
    }

    public boolean verify(String item){
        for(String s : shoplist){
            if(item.startsWith("Food") || item.startsWith("Other")){
                if(item.equals(s)) {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean add(String item){
        if (shoplist.isEmpty()){
            if(item.startsWith("Food") || item.startsWith("Other")){
                shoplist.add(item);
                return true;
            }else {
                return false;
            }
        }
        if(verify(item)== true){
            shoplist.add(item);
            return true;
        }
        return false;
    }

    public int ShopListSize(){
        return shoplist.size();
    }

    public void Food(){
        for(String s : shoplist){
            if(s.startsWith("Food")){
                System.out.println(s);
            }
        }
    }

    public void Other(){
        for(String s : shoplist){
            if(s.startsWith("Other")){
                System.out.println(s);
            }
        }
    }

}
