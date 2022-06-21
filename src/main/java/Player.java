import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {
    private String name;
    private String notifyRoll;

    public Player(String name) {
        this.name = name;
    }

    public String getNotifyRoll() {
        return this.notifyRoll;
    }

    public void dungeonMaster(Master dm) {
        dm.addObserver(this);
    }

    public void update(Observable dm, Object arg1) {
        this.notifyRoll = this.name + ", no seu turno você pode realizar as " + dm.toString();
    }
}
