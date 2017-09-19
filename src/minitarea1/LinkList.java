package minitarea1;

/**
 * Created by Daniel Araya on 18-09-2017.
 */
public class LinkList implements ILinkList {
    private Node first;

    public LinkList(){
        first = new NullNode();
    }
    @Override
    public void addFirst(Object o) {
        first = new ConcreteNode (o, first);
    }

    @Override
    public boolean includes(Object o) {
        return first.includes(o);
    }

    @Override
    public int size() {
        return first.size();
    }

    @Override
    public boolean isEmpty(){
        return this.size() == 0;
    }
}
