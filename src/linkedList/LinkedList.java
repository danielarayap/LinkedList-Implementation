package linkedList;

public class LinkedList implements ILinkedList {

    private INode first, last;

    public LinkedList(){
        first = new NullNode();
    }

    @Override
    public void addFirst(Object o) {
        if (this.isEmpty())
            first = last = new Node(o, first);
        else
            first = new Node(o, first);
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
            first = last = new Node(o, first);
        }
        else {
            INode temp = new Node(o, last.getNext());
            last.setNext(temp);
            last = last.getNext();
        }
    }

    @Override
    public Object extractFirst(){
        Object o = first.getValue();
        first = first.getNext();
        return o;
    }

    @Override
    public Object extractLast(){
        Object o = last.getValue();
        return o;
    }


}
