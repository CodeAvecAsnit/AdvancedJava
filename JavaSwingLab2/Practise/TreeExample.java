package JavaSwingLab2.Practise;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        var folder1 = new DefaultMutableTreeNode("Folder 1");
        var folder2 = new DefaultMutableTreeNode("Folder 2");
        var file1 = new DefaultMutableTreeNode("File 1");
        var file2 = new DefaultMutableTreeNode("File 2");
        root.add(folder1);
        root.add(folder2);

        folder1.add(file1);
        folder2.add(file2);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(300,300);

        JScrollPane treeView = new JScrollPane();
        frame.add(treeView);

        JTree jtree= new JTree(root);
        frame.add(jtree);

        frame.setVisible(true);




    }
}
