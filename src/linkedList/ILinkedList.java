package linkedList;

/**
 * ILinkedList is an interface with the methods that will be implemented in the LinkedList abstract
 * class.
 *
 * @author Daniel Araya.
 * @since 1.0.
 */
public interface ILinkedList {

    /**
     * inserts an element at the start of the list
     *
     * @param o Object to be inserted.
     */
    void addFirst (Object o);

    /**
     * checks if a list contains an object
     *
     * @param o Object to check in the list
     * @return true if the list contains an object
     */
    boolean includes (Object o);

    /**
     * @return list size (0 if is empty)
     */
    int size();

    /**
     * @return true if the list is empty
     */
    boolean isEmpty();

    /**
     * @param o Object to find in the list
     * @return the index where the object is in the list
     */
    int indexOf(Object o);

    /**
     * inserts an element at the start of the list
     *
     * @param o Object to be inserted.
     */
    void addLast(Object o);

    /**
     * extracts first element in the list
     *
     * @return the object at the start of the list
     */
    Object extractFirst();

    /**
     * extracts last element in the list
     *
     * @return the object at the end of the list
     */
    Object extractLast();

}
