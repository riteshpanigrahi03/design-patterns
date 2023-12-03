package singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton lazyInitSingletonInstance;

    private LazyInitSingleton() {

    }

    /**
     * This static method will initialize the object when it is called for the first time,
     * for the subsequent calls the if condition will fail and it will return the already created object
     * @return the singleton object
     */
    public static LazyInitSingleton getInstance() {
        if (lazyInitSingletonInstance == null) {
            lazyInitSingletonInstance = new LazyInitSingleton();
        }
        return lazyInitSingletonInstance;
    }

    public void printMessage(String threadName) {
        System.out.println("Hello from " + threadName + "! " + getClass().getSimpleName() + "Instance hash code: " + this.hashCode());
    }
}
