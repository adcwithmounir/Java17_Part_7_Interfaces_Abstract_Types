import java.util.ArrayList;
import java.util.List;

sealed abstract class Content permits Movie, Series, LiveEvent, Documentary {
    final String title;

    Content(String title) {
        this.title = title;
    }

    String describe() {
        return title + " (" + getClass().getSimpleName() + ")";
    }
}

final class Movie extends Content {
    Movie(String title) {
        super(title);
    }
}

sealed class Series extends Content permits MiniSeries {
    Series(String title) {
        super(title);
    }
}

final class MiniSeries extends Series {
    MiniSeries(String title) {
        super(title);
    }
}

non-sealed class LiveEvent extends Content {
    LiveEvent(String title) {
        super(title);
    }
}

class Concert extends LiveEvent {
    Concert(String title) {
        super(title);
    }
}

final class Documentary extends Content {
    Documentary(String title) {
        super(title);
    }
}

public class ContentCatalog {
    public static void main(String[] args) {
        List<Content> catalog = new ArrayList<>();
        catalog.add(new Movie("Night Shift"));
        catalog.add(new Series("Dark Harbor"));
        catalog.add(new MiniSeries("The Last Lighthouse"));
        catalog.add(new Concert("Summer Fest Live"));
        catalog.add(new Documentary("Deep Oceans"));
        for (Content item : catalog) {
            System.out.println(item.describe());
        }
        for (Class<?> type : Content.class.getPermittedSubclasses()) {
            System.out.println("Permitted: " + type.getSimpleName());
        }
    }
}
