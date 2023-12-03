package singleton;

public class MultiThreadLazySingleton {
    private static MultiThreadLazySingleton multiThreadLazySingletonInstance;

    private MultiThreadLazySingleton() {

    }

    public static MultiThreadLazySingleton getInstance() {
        if (multiThreadLazySingletonInstance == null) {
            synchronized (MultiThreadLazySingleton.class) {
                if (multiThreadLazySingletonInstance == null) {
                    multiThreadLazySingletonInstance = new MultiThreadLazySingleton();
                }
            }
        }
        return multiThreadLazySingletonInstance;
    }

    public void printMessage(String threadName) {
        System.out.println("Hello from " + threadName + "! " + getClass().getSimpleName() + "Instance hash code: " + this.hashCode());
    }
}
