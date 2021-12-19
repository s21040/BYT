import java.time.Duration;

class Audio extends Media{

    public Duration duration;
    public Format format;

    public Audio(int weight, Format format, Duration duration) {
        super(weight);
        this.format = format;
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public enum Format {
        MP3("mp3"),
        AAC("aac"),
        WAV("wav"),
        FLAC("flac"),
        ALAC("alac");

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
