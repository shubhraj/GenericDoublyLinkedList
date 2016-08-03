/**
 * Created by patilsh on 8/3/2016.
 */
public class DLNode<T> {
    private T data;
    private DLNode<T> nextNode;
    private  DLNode<T> prevNode;


    public DLNode() {
        data = null;
        nextNode = null;
        prevNode = null;
    }
}
