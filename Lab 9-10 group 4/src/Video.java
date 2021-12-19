import java.time.Duration;

class Video extends Media{

    public Duration duration;
    public Format format;

    public Video(int weight, Format format, Duration duration) {
        super(weight);
        this.format = format;
        this.duration=duration;
    }
    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public enum Format{
        MP4("mp4"),
        AVI("avi"),
        MOV("mov"),
        AAC("aac");
        public String format;

        Format(String format) {
            this.format = format;
        }

        public String getFormat(){
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

    }
}
