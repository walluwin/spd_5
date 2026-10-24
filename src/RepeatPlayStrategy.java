import java.util.List;

public class RepeatPlayStrategy implements PlaybackStrategy {

    private static final int REPEAT_COUNT = 3;

    @Override
    public void play(List<String> songs) {
        System.out.println("\nRepeat Play:");

        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        String song = songs.get(0);

        for (int i = 1; i <= REPEAT_COUNT; i++) {
            System.out.println("Playing: " + song
                    + " (repeat " + i + ")");
        }
    }
}