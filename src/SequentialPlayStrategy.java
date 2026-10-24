import java.util.List;

public class SequentialPlayStrategy implements PlaybackStrategy {

    @Override
    public void play(List<String> songs) {
        System.out.println("\nSequential Play:");

        for (String song : songs) {
            System.out.println("Playing: " + song);
        }
    }
}