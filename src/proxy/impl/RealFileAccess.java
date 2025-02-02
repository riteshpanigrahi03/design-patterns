package proxy.impl;

import proxy.FileAccess;

//Real object that performs actual file deletion
public class RealFileAccess implements FileAccess {
    @Override
    public void deleteFile(String fileName) {
        System.out.println("File " + fileName + " deleted successfully.");
    }
}
