package minitarea1;

public class LinkedList implements ILinkedList {
    private INode first, last;

    public LinkedList(){
        first = new NullNode();
    }
    @Override
    public void addFirst(Object o) {
        if (this.isEmpty()) {
            first = last = new ConcreteNode(o, first);
        }
        else {
            first = new ConcreteNode(o, first);
        }
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

    public int indexOf (Object o){
        return first.indexOf(o);
    }

    @Override
    public void addLast(Object o) {
        if (this.isEmpty()){
            first = last = new ConcreteNode(o, first);
        }
        else {
            INode temp = new ConcreteNode(o, last.getNext());
            last.setNext(temp);
            last = last.getNext();
        }
    }

}
