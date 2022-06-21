import java.util.List;
import java.util.Observable;

public class Master extends Observable{

    private String name;
    private List<String> actions;

    public Master(String name, List<String> actions) {
        this.name = name;
        this.actions = actions;
    }

    public void CombatTurn() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Ações{" +
                "nome=" + name +
                ", semestre=" + actions +
                '}';
    }
}
