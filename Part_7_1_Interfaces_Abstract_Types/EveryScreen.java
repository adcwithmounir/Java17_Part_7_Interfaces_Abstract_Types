interface Playable {
    String title();

    static String brand() { return "ADCFlix"; }

    private String tag(String t) {
        return "[" + brand() + "] Playing " + t;
    }

    default String play() { return tag(title()); }
}

interface Mobile {
    default String quality() { return "720p"; }
}

interface SmartTv {
    default String quality() { return "4K"; }
}

class Movie implements Playable, Mobile, SmartTv {
    public String title() { return "Dune"; }

    public String quality() { return SmartTv.super.quality(); }
}

public class EveryScreen {
    public static void main(String[] args) {
        Movie dune = new Movie();
        System.out.println(dune.play() + " in " + dune.quality());
        System.out.println("Brand: " + Playable.brand());
    }
}
