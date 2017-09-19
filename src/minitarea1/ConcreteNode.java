package minitarea1;

/**
 * Created by Daniel Araya on 18-09-2017.
 */
public class ConcreteNode implements Node {

    private Object value;
    private Node next;

    public ConcreteNode(Object o, Node first) {
        value = o;
        next = first;
    }

    @Override
    public boolean includes (Object o){
        return value.equals(o) || next.includes(o);
    }

    @Override
    public int size(){
        return 1 + next.size();
    }
}
