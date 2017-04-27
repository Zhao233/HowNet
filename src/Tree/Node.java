package Tree;

import java.util.ArrayList;

/**
 * Created by zx on 2017/3/5.
 */
public class Node<T> {
    public boolean isVisited;

    public String info;
    public int id;
    private ArrayList<Node> children;

    public Node(int nodeId, String newInfo) {
        id = nodeId;
        info = newInfo;
    }

    public void addChild(Node child){
        if(children == null){
            children = new ArrayList<Node>();
        }

        if(child != this){
            children.add(child);
        }
    }

}