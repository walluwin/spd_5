import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflePlayStrategy implements PlaybackStrategy {

    @Override
    public void play(List<String> songs) {
        List<String> shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);

        System.out.println("\nShuffle Play:");

        for (String song : shuffledSongs) {
            System.out.println("Playing: " + song);
        }
    }
}