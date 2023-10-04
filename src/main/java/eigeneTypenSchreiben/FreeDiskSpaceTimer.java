package eigeneTypenSchreiben;
import java.util.Timer;

public class FreeDiskSpaceTimer {
    public static void main(String[] args) {
        new Timer().schedule( new FreeDiskSpaceTimerTask(), 0, 2000 );
    }
}
