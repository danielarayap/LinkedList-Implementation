package minitarea1;

public interface INode {
    boolean includes (Object o);
    int size();
    int indexOf(Object o);
    INode getNext();
    void setNext(INode node);
}

