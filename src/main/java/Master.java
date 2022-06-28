import java.util.Observable;

public class Master extends Observable{

    private String name;
    private String action;

    public Master(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void rollAction() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Dungeon Master " + name +
                " à realizar a rolagem para a ação de " + actions +
                ".";
    }
}
