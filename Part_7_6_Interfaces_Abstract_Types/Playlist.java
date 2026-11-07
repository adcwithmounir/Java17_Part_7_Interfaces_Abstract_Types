interface Playable {
    String play();
}

class Content {
    String title;
    Content(String title) { this.title = title; }
    String kind() { return "content"; }
    String describe() { return kind() + ": " + title; }
}

class Movie extends Content implements Playable {
    int minutes;
    Movie(String title, int minutes) { super(title); this.minutes = minutes; }
    String kind() { return "movie"; }
    public String play() { return "Playing " + title; }
}

class Episode extends Content implements Playable {
    Episode(String title) { super(title); }
    String kind() { return "episode"; }
    public String play() { return "Streaming " + title; }
}

public class Playlist {
    public static void main(String[] args) {
        Content[] items = { new Movie("Inception", 148), new Episode("Pilot"), new Content("Trailer") };
        for (Content item : items) {
            System.out.println(item.describe());
            if (item instanceof Playable p) {
                System.out.println("  " + p.play());
            }
            if (item instanceof Movie m) {
                System.out.println("  " + m.minutes + " min");
            }
        }
    }
}
