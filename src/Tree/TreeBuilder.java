package Tree;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/24.
 */

public class TreeBuilder {
    private Tree tree;

    public TreeBuilder(Tree newTree){
        tree = newTree;
    }

    public void build(Node node, Node fatherNode){
        fatherNode.addChild(node);
    }
    public void build(int id, int fatherId){
        if(fatherId != id){
            build(tree.findNodeById(id), tree.findNodeById(fatherId));
        } else {
            tree.root = tree.findNodeById(id);
        }

    }
    public void build(Node node, int fatherId){
        build(node,tree.findNodeById(fatherId));
    }

    public void addNodeToTheNodes(Node node){
        tree.nodes.put(node.id, node);
    }
}
