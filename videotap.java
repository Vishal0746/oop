class VideoTape {
    protected String title;
    protected double duration;
    
    public VideoTape(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String director;
    
    public Movie(String title, double duration, String director) {
        super(title, duration);
        this.director = director;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    
    public MusicVideo(String title, double duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Artist: " + artist);
    }
}

public class videotap {
    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", 142.5, "Frank Darabont");
        movie.displayInfo();
        
        System.out.println();
        
        MusicVideo musicVideo = new MusicVideo("Shape of You", 4.2, "Ed Sheeran");
        musicVideo.displayInfo();
    }
}
