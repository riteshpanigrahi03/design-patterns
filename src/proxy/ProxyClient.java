package proxy;

import proxy.impl.FileAccessProxy;

public class ProxyClient {
    public static void main(String[] args) {
        FileAccess adminAccess = new FileAccessProxy("ADMIN");
        adminAccess.deleteFile("data.txt"); // Allowed ✅

        System.out.println("----");

        FileAccess userAccess = new FileAccessProxy("USER");
        userAccess.deleteFile("data.txt"); // Denied ❌
    }
}
