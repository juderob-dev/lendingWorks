import java.util.HashMap;

public class shoppingCart {
    private  HashMap<String,Number> itemPrice=new HashMap<String,Number>();
    public shoppingCart(){
        itemPrice.put("A",50);
        itemPrice.put("B",60);
        itemPrice.put("C",25);
        itemPrice.put("D",150);
        itemPrice.put("E",200);
    }
    void addTo(String item){

    }
}
