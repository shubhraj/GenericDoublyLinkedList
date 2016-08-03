/**
 * Created by patilsh on 8/3/2016.
 */
public class DLList<T> {
    private DLNode<T> head ;
    private DLNode<T> currentNode;

    public DLList() {
        head = null;
        currentNode = null;
    }

    public void insertAtBeginning(){
        DLNode<T> newNode = new DLNode<T>();
        if(head == null){
                head = newNode;
                head.setNextNode(null);
            }
    }

    public void display(){

        currentNode = head;
        while(currentNode.getNextNode() != null){
            System.out.println(currentNode.getData());
        }

    }
}
