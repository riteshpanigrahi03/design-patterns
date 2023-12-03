package singleton;

public class EagerInitSingleton {
    /**
     * In this approach, object is created beforehand when the class is loaded
     * Whenever getInstance method is called, the same object is returned
     * Pros - This is thread-safe, as multiple threads call call the getInstance method at same time, and same object will be returned.
     * Cons - Waste of resources, as object is created already but there can be cases that it is never been used
     */
    private static final EagerInitSingleton eagerInitSingletonInstance = new EagerInitSingleton();

    private EagerInitSingleton() {

    }

    public static EagerInitSingleton getInstance() {
        return eagerInitSingletonInstance;
    }

    public void printMessage(String threadName) {
        System.out.println("Hello from " + threadName + "! " + getClass().getSimpleName() + "Instance hash code: " + this.hashCode());
    }
}
