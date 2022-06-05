import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestClass {

    @Test
    public void checkforwhenBinputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("B");




        assertEquals("£0.60",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkforwhenAInputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("A");




        assertEquals("£0.50",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkForWhenCInputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("C");




        assertEquals("£0.25",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkforwhenDinputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("D");




        assertEquals("£1.50",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkforwhenEinputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("E");




        assertEquals("£2.00",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkforwhendealCinputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("C");
        alice.addTo("C");
        alice.addTo("C");
        alice.addTo("C");
        alice.addTo("C");
        alice.addTo("C");
        alice.addTo("C");




        assertEquals("£1.25",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkforwhendealDandEinputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("D");
        alice.addTo("E");
        alice.addTo("D");
        alice.addTo("E");
        alice.addTo("D");
        alice.addTo("D");
        alice.addTo("D");




        assertEquals("£10.50",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkForWhenDealLowercaseInputOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("D");
        alice.addTo("e");
        alice.addTo("e");
        alice.addTo("d");
        alice.addTo("D");
        alice.addTo("D");
        alice.addTo("D");




        assertEquals("£10.50",alice.checkOut(),"check the output ");

    }
    @Test
    public void checkForIllegalArgumentOutput(){
        assertThrows(IllegalArgumentException.class,()->{
            shoppingCart alice=new shoppingCart();
            alice.addTo("D");
            alice.addTo("l");
            alice.addTo("o");
            alice.addTo("d");
            alice.addTo("D");
            alice.addTo("D");
            alice.addTo("D");

        },"check that any letter that is not prescribed will throw an exception");







    }


    
}
