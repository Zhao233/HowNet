package File;

import Tree.Node;
import Tree.TreeBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/24.
 */
public class FileReader {
    public TreeBuilder treeBuilder;

    public File file;
    public java.io.FileReader fileReader;
    public BufferedReader reader;

    public FileReader(File newFile, TreeBuilder builder){
        file = newFile;
        try {
            fileReader = new java.io.FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        reader = new BufferedReader(fileReader);

        treeBuilder = builder;
    }

    public void readFileToNodeList(){
        String content = "";
        String[] contents;
        try {
            content = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        while(content != null) {
            contents = content.split(" +");

            int tempId = Integer.parseInt(contents[1]); // get id
            String tempInfo = contents[2]; // get node info
            int tempFatherId = Integer.parseInt(contents[3]); // get father id

            Node tempNode = new Node(tempId, tempInfo);

            treeBuilder.addNodeToTheNodes(tempNode);
            treeBuilder.build(tempId, tempFatherId);

            try { // read next line
                content = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void getContent(){
        String content="";
        String[] contents;

        try {
            content = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(content != null){
            contents = content.split(" +");
            System.out.println(contents.toString());
            try {
                content = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
