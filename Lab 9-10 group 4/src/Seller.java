import java.util.ArrayList;

 public class  Seller {

    ArrayList<String> listOfNFT = new ArrayList();
    int balance;

    public void setListOfNFT(ArrayList<String> listOfNFT) {
        this.listOfNFT = listOfNFT;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<String> getListOfNFT() {
        return listOfNFT;
    }

    public int getBalance() {
        return balance;
    }

    public Seller(ArrayList listOfNFT, int balance){
        this.listOfNFT = listOfNFT;
        this.balance = balance;
    }
    public Seller(){

    }

    }

