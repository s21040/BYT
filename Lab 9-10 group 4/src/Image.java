class Image extends Media{

    public String resolution;
    public Format format;

    public Image(int weight, Format format, String resolution) {
        super(weight);
        this.format = format;
        this.resolution= resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }


    public enum Format{
        PNG("png"),
        JPG("jpg"),
        JP2("jp2"),
        GIF("gif"),
        TIFF("tiff");
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
