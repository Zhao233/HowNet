package Tree;

/**
 * Created by Administrator on 2017/4/24.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zx on 2017/3/5.
 */
public class Tree {
    public        Node                   root;
    public        HashMap<Integer, Node> nodes;

    /*deletable*/
    public Node thisNode;


    public Tree(Node newRoot){
        root = newRoot;
        thisNode = root;

        nodes = new HashMap();
        nodes.put(0,root);
    }
    public Tree(){
        nodes = new HashMap();
    }

    public void setTree(Node node, ArrayList<Node> children){
        //node.setChildren(children);
    }

    public Node findNodeById(int id){
        return nodes.get(id);
    }
}