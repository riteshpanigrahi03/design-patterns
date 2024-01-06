package composite;

public class CompositeDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("passport.pdf");
        FileSystemComponent file2 = new File("result.jpg");

        Directory rootDirectory = new Directory("root");
        Directory subDirectory = new Directory("SubFolder");
        subDirectory.addComponent(file2); // adding file2 in subfolder

        rootDirectory.addComponent(file1); //adding file 1 in root
        rootDirectory.addComponent(subDirectory); //adding subfolder in root directory

        rootDirectory.ls();
    }
}
/*
 * Directory ->root
 * File ->passport.pdf
 * Directory ->SubFolder
 * File ->result.jpg
 */
