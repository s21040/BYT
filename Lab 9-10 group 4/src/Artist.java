
public class Artist extends Person{

    String contactInformation;
    Status status;
    NFT nft;

    public enum Status{
        POPULAR("popular"),
        NEWBIE("newbie"),
        AUTHORIZED("authorized");

        private String status;

        Status(String status){
            this.status = status;
        }

        public String getStatus(){
            return status;
        }
    }

    public Artist(String login, String password, String contactInformation, Status status) {
        super(login, password);
        this.contactInformation = contactInformation;
        this.status = status;
    }
    public Artist() {
        super("login", "password");
    }
    public String getContactInformation() {
        return contactInformation;
    }
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
    @Override
    public void signUp() {

    }

    @Override
    public void logIn() {

    }
}
