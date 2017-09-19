package minitarea1;

public class ConcreteNode implements INode {

    private Object value;
    private INode next;

    ConcreteNode(Object o, INode nxt) {
        value = o;
        next = nxt;
    }

    @Override
    public boolean includes (Object o){
        return value.equals(o) || next.includes(o);
    }

    @Override
    public int size(){
        return 1 + next.size();
    }

    @Override
    public int indexOf(Object o) {
        return value.equals(o) ? 0 : 1 + next.indexOf(o);
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode node) {
        next = node;
    }

}
