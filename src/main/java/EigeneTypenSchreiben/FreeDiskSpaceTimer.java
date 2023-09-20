package EigeneTypenSchreiben;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
public class FreeDiskSpaceTimer {
    public static void main(String[] args) {
        new Timer().schedule( new FreeDiskSpaceTimerTask(), 0, 2000 );
    }
}
