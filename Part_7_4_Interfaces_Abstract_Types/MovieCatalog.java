record Movie(String title, int minutes) {
    Movie {
        if (minutes <= 0) throw new IllegalArgumentException("Running time must be positive: " + minutes);
        title = title.strip();
    }

    Movie(String title) {
        this(title, 90);
    }

    String label() {
        return title + " (" + minutes + " min)";
    }
}

public class MovieCatalog {
    public static void main(String[] args) {
        Movie nightShift = new Movie("Night Shift", 118);
        System.out.println(nightShift);
        System.out.println(nightShift.title() + " lasts " + nightShift.minutes() + " minutes");
        Movie copy = new Movie("Night Shift", 118);
        System.out.println(nightShift.equals(copy));
        Movie directorsCut = new Movie(nightShift.title(), nightShift.minutes() + 12);
        System.out.println(directorsCut);
        Movie shortFilm = new Movie("  Paper Boats  ");
        System.out.println(shortFilm.label());
        Movie broken = new Movie("Broken Reel", -5);
        System.out.println(broken.label());
    }
}
