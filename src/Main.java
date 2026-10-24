import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> songs = Arrays.asList(
                "Blinding Lights",
                "Starboy",
                "Save Your Tears",
                "The Hills",
                "Die For You"
        );

        MusicPlayer player =
                new MusicPlayer(new SequentialPlayStrategy());

        player.play(songs);

        player.setPlaybackStrategy(new ShufflePlayStrategy());
        player.play(songs);

        player.setPlaybackStrategy(new RepeatPlayStrategy());
        player.play(songs);
    }
}