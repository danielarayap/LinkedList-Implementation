package linkedList;

/**
 * INode is an interface with the methods that will be implemented in the Node and NullNode classes.
 *
 * @author Daniel Araya.
 * @since 1.0.
 */
public interface INode {

    /**
     * checks if a node contains an object
     *
     * @param o Object to check in the node
     * @return true if the node contains the object
     */
    boolean includes (Object o);

    /**
     * @return node size
     */
    int size();

    /**
     * @param o Object to find in the node
     * @return the index where the Object is in the node chain
     */
    int indexOf(Object o);

    /**
     * inserts the node given into this node's next.
     *
     * @param node Node to insert in the node
     */
    void setNext (INode node);

    /**
     * @return the node in the next position after this node
     */
    INode getNext();

    /**
     * @return the node's value
     */
    Object getValue();
}
