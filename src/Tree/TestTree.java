package Tree;

class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class TestTree {
    public static Node build(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        g.right=h;
        c.right=f;

        return a;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    //写一个方法，求二叉树中结点的个数
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        //结点个数等于根节点+左子树的节点个数+右子树的节点个数
        return 1+size(root.left)+size(root.right);
    }
    //求二叉树中叶子结点的个数
    //遍历树，将问题拆分成求root.left的叶子节点个数+root.right的叶子节点个数
    public static int leftSize(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return leftSize(root.left)+leftSize(root.right);
    }
    //求第k层的节点个数
    //如果K<1，只能是空树，直接返回0
    //如果k==1；说明只有一个根节点，返回1
    //第k层的节点个数=左子树的k-1层节点个数+右子树的(k-1)节点个数
    public static int kLevelSize(Node root,int k){
        if(k<1||root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
    }
    //在二叉树中查找指定元素。核心元素还是递归
    //如果找到了返回引用，如果不存在返回null
    Node find(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        Node result=find(root.left,val);
        if(result!=null){
            return result;
        }
        return find(root.right,val);
    }
    public static void main(String[] args) {
        Node root=build();
        System.out.println("先序遍历：");
        preOrder(root);
        System.out.println();

        System.out.println("中序遍历：");
        inOrder(root);
        System.out.println();

        System.out.println("后序遍历：");
        postOrder(root);
        System.out.println();

        System.out.println("结点个数为: "+size(root));
        System.out.println("叶子结点个数为："+leftSize(root));
        System.out.println("第3层结点个数为："+kLevelSize(root,3));
    }
}

