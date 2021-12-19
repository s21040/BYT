import java.util.Date;

public class Auction {
    public int _minPrice;
    public int _maxPrice;
    Date _expiryDate;

    public Auction(int _minPrice, int _maxPrice, Date _expiryDate) {
        this._minPrice = _minPrice;
        this._maxPrice = _maxPrice;
        this._expiryDate = _expiryDate;
    }


    public void setMinPrice(int x){
        this._minPrice = x;
    }
    public int getMinPrice(){
        return this._minPrice;
    }

    public void setMaxPrice(int x){
        this._maxPrice = x;
    }

    public int getMaxPrice() {
        return _maxPrice;
    }

    public Date getExpiryDate() {
        return _expiryDate;
    }

    public void setExpiryDate(Date _expiryDate) {
        this._expiryDate = _expiryDate;
    }

    public void CloseWhenTimeUp(){

    }

    public void CloseWhenMaxPriceOffered(){

    }

    public void PutIteamForAuction(){

    }

    public void OfferPrice(){

    }
}