package SeqList;

public class Test {
        private static void testDisplay(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.display();
        }
        private static void testAdd(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.add(0,100);
            seqListDemo.add(0,200);
            seqListDemo.add(0,300);
            seqListDemo.add(0,400);
            seqListDemo.display();
        }
        private static  void testContains(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.add(0,100);
            seqListDemo.add(0,200);
            seqListDemo.add(0,300);
            seqListDemo.add(0,400);
            System.out.println(seqListDemo.contains(200));
        }
        private static void testSearch(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.add(0,1);
            seqListDemo.add(0,2);
            seqListDemo.add(0,3);
            seqListDemo.add(0,4);
            System.out.println(seqListDemo.search(5));
        }
        private static void testGetPos(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.add(0,1);
            seqListDemo.add(0,2);
            seqListDemo.add(0,3);
            seqListDemo.add(0,4);
            System.out.println(seqListDemo.getPos(4));
        }
        private static void testRemove(){
            SeqListDemo seqListDemo=new SeqListDemo();
            seqListDemo.add(0,1);
            seqListDemo.add(0,2);
            seqListDemo.add(0,3);
            seqListDemo.add(0,4);
            seqListDemo.remove(3);
            seqListDemo.display();

        }

        public static void main(String[] args) {
            //   testAdd();
            //   testContains();
            //   testSearch();
            //    testGetPos();
            testRemove();
        }
    }

