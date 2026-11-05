interface Subtitle {
    String language();
}

public class MediaPlayer {
    private String title = "Night Shift";

    class Screen {
        void show() {
            System.out.println("Now playing: " + title);
        }
    }

    static class Volume {
        int level = 7;
    }

    void play(int minutes) {
        class Timer {
            String left() {
                return title + ": " + minutes + " min left";
            }
        }
        Subtitle sub = new Subtitle() {
            public String language() {
                return "English";
            }
        };
        System.out.println(new Timer().left());
        System.out.println("Subtitles: " + sub.language());
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        MediaPlayer.Screen screen = player.new Screen();
        screen.show();
        MediaPlayer.Volume volume = new MediaPlayer.Volume();
        System.out.println("Volume: " + volume.level);
        player.play(118);
    }
}
