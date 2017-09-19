package minitarea1;

/**
 * Created by Daniel Araya on 18-09-2017.
 */
public class NullNode implements Node {
    @Override
    public boolean includes (Object o){
        return false;
    }

    @Override
    public int size(){
        return 0;
    }
}
