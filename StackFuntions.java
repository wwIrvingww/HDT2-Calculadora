import java.util.ArrayList;

public class StackFuntions implements IStack {
    ArrayList pila = new ArrayList();

    @Override
    public void Pop() {
        int lastIdx = pila.size() - 1;
        pila.remove(lastIdx);
    }

    @Override
    public void Push(Object item) {
        for (int i = pila.size(); i < 0; i--){
             Object value = pila.get(i);
            pila.set(i,value);
            i--;

        }
        pila.set(0, item);
    }

    @Override
    public int Size() {
        return pila.size();
    }

    @Override
    public Object Peek() {
        return pila.get(pila.size() - 1);
    }
}
