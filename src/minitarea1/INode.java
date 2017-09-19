package minitarea1;

public interface INode {
    boolean includes (Object o);
    int size();
    int indexOf(Object o);
    void setNext (INode node);
    INode getNext();
}

