package minitarea1;

public class NullNode implements INode {

    @Override
    public boolean includes (Object o){
        return false;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return -1;
    }

    @Override
    public INode getNext() {
        return null;
    }

    @Override
    public void setNext(INode node) {
    }

}
