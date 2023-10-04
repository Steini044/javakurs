package eigeneTypenSchreiben;

import java.util.TimerTask;

public class FreeDiskSpaceTimerTask extends TimerTask {

    @Override
    public void run() {
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if(freeDiskSpace < 100_000_000_000L){
            System.out.println("Meldung");
        }
    }

}
