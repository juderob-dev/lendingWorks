import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void checkOutput(){
        shoppingCart alice=new shoppingCart();
        alice.addTo("B");




        assertEquals("0.60",alice.checkOut(),"check the output ");

    }


    
}
