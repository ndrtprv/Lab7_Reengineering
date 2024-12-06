import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Vycheslav
 */
public class ShoppingCartTest {
    /**
     * Test of appendFormatted method, of class ShoppingCart.
     */
    @Test
    public void testAppendFormatted() {
        StringBuilder sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 14);
        assertEquals(sb.toString(), " SomeLine ");
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 15);
        assertEquals(sb.toString(), " SomeLine ");
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 5);
        assertEquals(sb.toString(), "SomeL ");
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 1, 15);
        assertEquals(sb.toString(), " SomeLine ");
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", -1, 15);
        assertEquals(sb.toString(), "SomeLine ");
    }

    /**
     * Test of calculateDiscount method, of class ShoppingCart.
     */
    @Test
    public void testCalculateDiscount() {
        System.out.println("calculateDiscount");
        ShoppingCart.ItemType type = null;
        int quantity = 0;
        int expResult = 0;
        int result = ShoppingCart.calculateDiscount(type, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove
        // the default call to fail.
        fail("The test case is a prototype.");
    }
}