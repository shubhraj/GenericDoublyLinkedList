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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DLNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DLNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DLNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DLNode<T> prevNode) {
        this.prevNode = prevNode;
    }
}
