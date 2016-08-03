/**
 * Created by patilsh on 8/3/2016.
 */
public class DLList<T> {
    private DLNode<T> head ;
    private DLNode<T> currentNode;
    private DLNode<T> tail;

    public DLList() {
        head = null;
        currentNode = null;
        tail = null;
    }

    public void insertAtBeginning(Integer i){
        DLNode<T> newNode = new DLNode<T>();
        newNode.setData((T) i);
        if(head == null){
                head = newNode;
                tail = newNode;
                newNode.setNextNode(null);
                newNode.setPrevNode(null);
            }else{
                newNode.setNextNode(head);
                head.setPrevNode(newNode);
                head = newNode;
        }
    }

    public int getSize(){
        int count = 0 ;
        currentNode = head;
        if(head == null)
            return count;
        do{
            ++count;
            currentNode = currentNode.getNextNode();
        }while(currentNode != null);
        return count;
    }
}
