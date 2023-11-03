import java.util.ArrayList;
import java.util.List;

public abstract class Operaciones {
    List<Observer> listObservers = new ArrayList<>();

    void attach(Observer o){
        listObservers.add(o);
    }

    void detach(Observer o){
        listObservers.remove(o);
    }

    void notificar(){
        for (Observer o : listObservers) {
            o.update();
        }
    }
}
