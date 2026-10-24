import java.util.List;

public class MusicPlayer {

    private PlaybackStrategy strategy;

    public MusicPlayer(PlaybackStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPlaybackStrategy(PlaybackStrategy strategy) {
        this.strategy = strategy;
    }

    public void play(List<String> songs) {
        strategy.play(songs);
    }
}