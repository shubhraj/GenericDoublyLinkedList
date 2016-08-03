import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by patilsh on 8/3/2016.
 */
public class TestDoublyLinkedList {
@Test
    public void testInsertAtBeggining(){
    DLList<Integer> list = new DLList<Integer>();
    list.insertAtBeginning(new Integer(10));
    list.insertAtBeginning(new Integer(20));
    list.insertAtBeginning(new Integer(30));

    assertEquals(3,list.getSize());
    }


}


