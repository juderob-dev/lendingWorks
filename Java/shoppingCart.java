import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.text.DecimalFormat;

public class shoppingCart {
    private  HashMap<String,Integer> itemPrice=new HashMap<String,Integer>();
    private HashMap<String,Integer> items=new HashMap<String,Integer>();

    /*created constructor  to add item to cart */
    public shoppingCart(){
        itemPrice.put("A",50);
        itemPrice.put("B",60);
        itemPrice.put("C",25);
        itemPrice.put("D",150);
        itemPrice.put("E",200);
    }
    /*created fuction to add item to cart */
    public void addTo(String item){
        if (item.toUpperCase().equals("A") || item.toUpperCase().equals("B")|| item.toUpperCase().equals("C")|| item.toUpperCase().equals("D")|| item.toUpperCase().equals("E")){
            if (!this.items.containsKey(item.toUpperCase())){
                this.items.put(item.toUpperCase(),1);

            }
            else{
                int temp=this.items.get(item.toUpperCase());
                this.items.put(item.toUpperCase(),temp+1);
            }

        }
        else {
            throw new IllegalArgumentException("please add with one of teh items on teh list ");

        }



    }/* create check out fuction so user was able to checkout */
    public String checkOut(){
        int cCount=0;
        int cValue=0;
        int bCount=0;
        int bValue=0;


        int bPrice=itemPrice.get("B");
        if(items.containsKey("C")){
            cCount=items.get("C");
            cValue=cCount/3>=1?((cCount/3)*itemPrice.get("C")*2)+((cCount%3)*itemPrice.get("C")):(cCount%3)*itemPrice.get("C");

        }
        if(items.containsKey("B")){
            bCount=items.get("B");

            bValue=bCount/2>=1?((bCount/2)*bPrice)+((bCount%2)*bPrice):((bCount%2)*bPrice);

        }
        int dCount=0;
        int eCount=0;
        int dPrice=itemPrice.get("D");

        if(items.containsKey("D")){
            dCount=items.get("D");


        }
        if(items.containsKey("E")){
            eCount=items.get("E");

        }
        int aCount=0;
        if(items.containsKey("A")){
            aCount=items.get("A");

        }








        int ePrice=itemPrice.get("E");
        int cDandE=Math.min(dCount,eCount);


        int dValue=(dCount-cDandE)*dPrice;
        int eValue=(eCount-cDandE)*ePrice;
        int vDandE=cDandE*300;
        int total=(aCount*itemPrice.get("A"))+bValue+cValue+dValue+eValue+vDandE;
        double result=(double)total/100;
        /* created decimal format so it could come out as money*/
        DecimalFormat x= new DecimalFormat("£0.00");
        return x.format(result);










    }
    public String toString(){
        DecimalFormat x= new DecimalFormat("£###.###");
        return x.format(this.checkOut());


    }
}
