

public abstract class Observer{
    Operaciones op;

    public Observer(Operaciones op){
        this.op = op;
        op.attach(this);
    }

    abstract void update();
}