
public class NFT {
    String title;
    String description;
    Artist artistName;
    int idNumber;

    public NFT(){
    }
    public NFT(String title, String description){
        this.title = title;
        this.description = description;
        idNumber = (int)Math.floor(Math.random()*(1000-0+1)+0);
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArtistName(Artist artistName) {
        this.artistName = artistName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Artist getArtistName() {
        return artistName;
    }



}
