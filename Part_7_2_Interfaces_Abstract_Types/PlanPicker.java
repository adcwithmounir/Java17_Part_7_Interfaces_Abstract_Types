enum Plan {
    BASIC(1, "720p"), STANDARD(2, "1080p"), PREMIUM(4, "4K");

    private final int screens;
    private final String quality;

    Plan(int screens, String quality) {
        this.screens = screens;
        this.quality = quality;
    }

    String describe() {
        return name() + ": " + quality + ", screens: " + screens;
    }
}

public class PlanPicker {
    public static void main(String[] args) {
        for (var plan : Plan.values()) {
            System.out.println(plan.describe());
        }
        Plan chosen = Plan.valueOf("PREMIUM");
        String perk = switch (chosen) {
            case BASIC -> "With ads";
            case STANDARD -> "No ads";
            case PREMIUM -> "No ads, downloads";
        };
        System.out.println(chosen + " perk: " + perk);
    }
}
