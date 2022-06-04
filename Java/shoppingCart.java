import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class shoppingCart {
    private  HashMap<String,Integer> itemPrice=new HashMap<String,Integer>();
    private HashMap<String,Integer> items=new HashMap<String,Integer>();
    public shoppingCart(){
        itemPrice.put("A",50);
        itemPrice.put("B",60);
        itemPrice.put("C",25);
        itemPrice.put("D",150);
        itemPrice.put("E",200);
    }
    public void addTo(String item){
        if (item.toUpperCase().equals("A") || item.toUpperCase().equals("B")|| item.toUpperCase().equals("C")|| item.toUpperCase().equals("D")|| item.toUpperCase().equals("E")){
            if (!this.items.containsKey(item)){
                this.items.put(item,1);

            }
            else{
                int temp=this.items.get(item);
                this.items.put(item,temp+1);
            }

        }
        else {
            throw new IllegalArgumentException("please add with one of teh items on teh list ");

        }



    }
    public double checkOut(){

        int cCount=items.get("C");
        int cValue=cCount/3>=1?((cCount/3)*itemPrice.get("C")*2)+((cCount%3)*itemPrice.get("C")):(cCount%3)*itemPrice.get("C");

        int bCount=items.get("B");
        int bPrice=itemPrice.get("B");
        int bValue=bCount/2>=1?((bCount/2)*bPrice)+((bCount%2)*bPrice):((bCount%2)*bPrice);


        int dCount=items.get("D");
        int dPrice=itemPrice.get("D");
        int eCount=items.get("E");
        int ePrice=itemPrice.get("E");
        int cDandE=Math.min(dCount,eCount);

        int dValue=(dCount-cDandE)*dPrice;
        int eValue=(eCount-cDandE)*ePrice;
        int vDandE=cDandE*300;
        int total=(items.get("A")*itemPrice.get("A"))+bValue+cValue+dValue+eValue+vDandE;
        double result=(double)total/100;


        return result;







    }
}
