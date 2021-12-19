import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class PurchaseTest {

    Purchase.PaymentMethod paymentMethod1, paymentMethod2;
    Purchase purchase1, purchase2;

    @Before
    public void setUp() throws Exception {
        paymentMethod1 = Purchase.PaymentMethod.CRYPTO;
        paymentMethod2 = Purchase.PaymentMethod.FIAT;
        purchase1 = new Purchase(1, new Date(2021, 12,19), paymentMethod1);
        purchase2 = new Purchase(2, new Date(2021, 12,15), paymentMethod2);
    }

    @Test
    public void constructorTest() {
        assertEquals(1, purchase1.getPaymentCredentials());
        assertEquals(new Date(2021, 12,19), purchase1.getDate());
        assertEquals("fiat", purchase2.paymentMethod.getPaymentMethod());

    }

    @Test
    public void getPaymentCredentials() {
        assertEquals(2, purchase2.getPaymentCredentials());
    }

    @Test
    public void setPaymentCredentials() {
        purchase2.setPaymentCredentials(3);
        assertEquals(3, purchase2.getPaymentCredentials());
    }

    @Test
    public void getDate() {
        assertEquals(new Date(2021, 12,15), purchase2.getDate());
    }

    @Test
    public void setDate() {
        purchase1.setDate(new Date(2021, 11, 20));
        assertEquals(new Date(2021, 11, 20), purchase1.getDate());
    }

    @Test
    public void testGetPaymentMethod(){
        assertEquals("crypto", purchase1.paymentMethod.getPaymentMethod());
    }

    @Test
    public void testSetPaymentMethod() {
        purchase2.paymentMethod.setPaymentMethod("crypto");
        assertEquals("crypto", purchase2.paymentMethod.getPaymentMethod());
    }

    @Test
    public void makePurchase() {
    }
}