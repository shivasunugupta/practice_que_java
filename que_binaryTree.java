import java.util.*;

public class que_binaryTree
{
    static class Node
    {
        que_binaryTree.Node left, right;
        int data;

        public Node(int data)
        {
            this.data = data;
            left=null;
            right =null;
        }
    }

    //  que -- -- -- height of a binary tree
    int height(Node root)
    {
        if (root ==null)
        {
            return 0;
        }
        else
        {
            return Math.max(height(root.left), height(root.left))+1;
        }
    }

    // que -- -- size of a binary tree
    int size(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            return size(root.left) + size(root.right) + 1;
        }
    }

    // que -- -- maximum in a binary tree
    int maximum(Node root)
    {
        if (root == null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {   //max of root left and root right = M --> than max of root data and M
            //two math.max is used in 1
            return Math.max( root.data, Math.max(maximum(root.left),maximum(root.right)));
        }
    }

    // que -- -- level order traversal in a binary tree
    void printLevel(Node root,int level)
    {
        if (root == null)
        {
            return;
        }
        else if (level ==1)
        {
            System.out.println(root.data + " ");
        }
        else if (level > 1)
        {
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }
        //here the time complexity will be O(n^2)
    }

    //another approach of level traversal can be done by using a queue
    void printLevel2(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);  //to diff between the elements of diff levels
        while(! q.isEmpty())
        {
            Node curr = q.poll();
            System.out.println(curr.data);
            if (curr == null)
            {
                if (q.isEmpty())
                {
                    return;
                }
                q.add(null);
                System.out.println();
            }

            if (curr.left != null)
            {
                q.add(curr.left);
            }
            if (curr.right != null)
            {
                q.add(curr.right);
            }
        }
    }

    // que -- --leftview of a binary tree
     void printLeftView(Node root)
     {
         ArrayList <Node> list = new ArrayList<>();
         printLeftUntil(root,list,0);
         for (Node curr :list)
         {
             System.out.println(curr.data + " ");
         }
     }
     void printLeftUntil(Node root, ArrayList list,int level)
     {
         if (root == null )
         {
             return;
         }
         if (list.get(level) == null)
         {
             list.add(root);
         }
         printLeftUntil(root.left,list,level+1);
         printLeftUntil(root.right,list,level+1);
     }

     // que -- --right view of a binary tree
     void printRightView(Node root)
     {
         ArrayList <Node> list = new ArrayList<>();
         printRightUntil(root,list,0);
         for (Node curr :list)
         {
             System.out.println(curr.data + " ");
         }
     }
    void printRightUntil(Node root, ArrayList list,int level)
    {
        if (root == null )
        {
            return;
        }
        if (list.get(level) == null)
        {
            list.add(root);
        }
        printRightUntil(root.right,list,level+1);
        printRightUntil(root.left,list,level+1);
    }

    // que -- -- top view of a binary tree



    //global scanner class
    static Scanner sc = new Scanner(System.in);

    //creating a binary tree
    static binary_tree.Node createTree()
    {
        binary_tree.Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if (data == -1)
        {
            return null;
        }

        root = new binary_tree.Node(data);

        System.out.println("Enter left child for " + data);
        root.left = createTree();

        System.out.println("Enter right child for " + data);
        root.right = createTree();

        return root;
    }

    //main class
    public static void main(String[] args)
    {
        System.out.println("Enter elements to create a binary tree. Enter -1 to indicate a null node.");
        binary_tree.Node root = createTree();

        System.out.println("Binary Tree created successfully!");


    }


}
