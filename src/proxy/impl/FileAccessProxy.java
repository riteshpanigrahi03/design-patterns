package proxy.impl;

import proxy.FileAccess;

//Proxy class that controls access
public class FileAccessProxy implements FileAccess {
    private RealFileAccess realFileAccess;
    private String userProfile;

    public FileAccessProxy(String userProfile) {
        this.realFileAccess = new RealFileAccess();
        this.userProfile = userProfile;
    }

    @Override
    public void deleteFile(String fileName) {
        if ("ADMIN".equalsIgnoreCase(userProfile)) {
            realFileAccess.deleteFile(fileName); // Delegating the request
        } else {
            System.out.println("Access Denied: Only ADMIN can delete files.");
        }
    }
}
