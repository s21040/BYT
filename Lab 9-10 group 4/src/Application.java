import java.util.Date;

public class Application {
    public Status status;

    public Application(Status status) {
        this.status = status;
    }

    public enum Status {
        WFV("waiting for verification"),
        APPROVED("approved"),
        AA("aborted application");

        private String status;

        public void setStatus(String status) {
            this.status = status;
        }

        Status(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }

    public void newApplication(){

    }
}