import org.example.WorkWithCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class WorkWithCollectionTest {

    private static final int NUM_OPERATIONS = 1000;

    @Test
    public void testAddArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.testAdd(list);
        assertTrue("Время выполнения для add (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testAddLinkedList() {
        List<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.testAdd(list);
        assertTrue("Время выполнения для add (LinkedList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testAddFirstArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.testAddFirst(list);
        assertTrue("Время выполнения для addFirst (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testAddFirstLinkedList() {
        List<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.testAddFirst(list);
        assertTrue("Время выполнения для addFirst (LinkedList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testAddMiddleArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.testAddMiddle(list);
        assertTrue("Время выполнения для addMiddle (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testAddMiddleLinkedList() {
        List<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.testAddMiddle(list);
        assertTrue("Время выполнения для addMiddle (LinkedList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testGetArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testGet(list);
        assertTrue("Время выполнения для get (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testGetLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testGet(list);
        assertTrue("Время выполнения для get (LinkedList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testDeleteArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testDelete(list);
        assertTrue("Время выполнения для delete (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testDeleteLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testDelete(list);
        assertTrue("Время выполнения для delete (LinkedList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testDeleteFirstArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testDeleteFirst(list);
        assertTrue("Время выполнения для deleteFirst (ArrayList) должно быть больше 0", timeTaken > 0);
    }

    @Test
    public void testDeleteFirstLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.testAdd(list);
        long timeTaken = WorkWithCollection.testDeleteFirst(list);
        assertTrue("Время выполнения для deleteFirst (LinkedList) должно быть больше 0", timeTaken > 0);
    }
}
