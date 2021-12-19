import java.util.Date;

public class Purchase {
    public int paymentCredentials;
    public Date date;
    public PaymentMethod paymentMethod;

    public Purchase( int paymentCredentials, Date date, PaymentMethod paymentMethod) {
        this.paymentCredentials = paymentCredentials;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }
    public enum PaymentMethod {
        CRYPTO("crypto"),
        FIAT("fiat");

        public String paymentMethod;

        PaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getPaymentMethod(){
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

    }

    public int getPaymentCredentials() {
        return paymentCredentials;
    }

    public void setPaymentCredentials(int paymentCredentials) {
        this.paymentCredentials = paymentCredentials;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void makePurchase(){}
}