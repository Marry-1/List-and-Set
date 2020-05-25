package LinkedList;

public class Test {
    private static void testAddFirst(){
        LinkedListDemo linkedListDemo=new LinkedListDemo();
        linkedListDemo.addFirst(1);
        linkedListDemo.addFirst(2);
        linkedListDemo.addFirst(3);
        linkedListDemo.addFirst(4);
        linkedListDemo.display();
    }
    private static void testAddIndex(){
        LinkedListDemo linkedListDemo=new LinkedListDemo();
        linkedListDemo.addFirst(1);
        linkedListDemo.addFirst(2);
        linkedListDemo.addFirst(3);
        linkedListDemo.addFirst(4);
        System.out.println(linkedListDemo.contains(2));
        // linkedListDemo.addIndex(2,5);
        //  linkedListDemo.display();
    }
    private static void testRemove(){
        LinkedListDemo linkedListDemo=new LinkedListDemo();
        linkedListDemo.addLast(1);
        linkedListDemo.addLast(2);
        linkedListDemo.addLast(3);
        linkedListDemo.addLast(4);
        linkedListDemo.remove(3);
        linkedListDemo.display();
    }
    private static void testRomoveAll(){
        LinkedListDemo linkedListDemo=new LinkedListDemo();
        linkedListDemo.addLast(1);
        linkedListDemo.addLast(3);
        linkedListDemo.addLast(3);
        linkedListDemo.addLast(4);
        linkedListDemo.removeAll(3);
        linkedListDemo.display();
    }

    public static void main(String[] args) {
        //  testAddFirst();
        //  testAddIndex();
        // testRemove();
        testRomoveAll();
    }
}

