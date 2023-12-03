package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        implementLazyInitSingleton();
//        implementMultiThreadLazyInit();
//        implementEagerInitSingleton();
//        implementMultiThreadEagerInit();
//        implementMultiThreadLazyInitWithSynchronization();
//        implementSerializableSingleton();
        implementReflection();
    }

    private static void implementSerializableSingleton() throws IOException, ClassNotFoundException {
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton Object 2 :" + deserializedInstance.hashCode());
    }

    private static void implementMultiThreadLazyInitWithSynchronization() {
        Thread thread1 = new Thread(() -> MultiThreadLazySingleton.getInstance().printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> MultiThreadLazySingleton.getInstance().printMessage("Thread 2"));
        Thread thread3 = new Thread(() -> MultiThreadLazySingleton.getInstance().printMessage("Thread 3"));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void implementMultiThreadEagerInit() {
        // Create three threads
        Thread thread1 = new Thread(() -> EagerInitSingleton.getInstance().printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> EagerInitSingleton.getInstance().printMessage("Thread 2"));
        Thread thread3 = new Thread(() -> EagerInitSingleton.getInstance().printMessage("Thread 3"));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void implementMultiThreadLazyInit() {
        // Create three threads
        //This creates multiple objects , though class was designed as Singleton class.
        //This is why LazyInitSingleton is not thread-safe
        Thread thread1 = new Thread(() -> LazyInitSingleton.getInstance().printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> LazyInitSingleton.getInstance().printMessage("Thread 2"));
        Thread thread3 = new Thread(() -> LazyInitSingleton.getInstance().printMessage("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
        /**
         * Sample Output
         * Hello from Thread 3! LazyInitSingletonInstance hash code: 2007819528
         * Hello from Thread 1! LazyInitSingletonInstance hash code: 1600927072
         * Hello from Thread 2! LazyInitSingletonInstance hash code: 2007819528
         */
    }

    private static void implementLazyInitSingleton() {
        LazyInitSingleton lazyInitSingleton1 = LazyInitSingleton.getInstance();
        LazyInitSingleton lazyInitSingleton2 = LazyInitSingleton.getInstance();

        System.out.println("LazyInitSingleton Obj 1 Hashcode : " + lazyInitSingleton1.hashCode());
        System.out.println("LazyInitSingleton Obj 2 Hashcode : " + lazyInitSingleton2.hashCode());
    }

    private static void implementEagerInitSingleton() {
        EagerInitSingleton eagerInitSingleton1 = EagerInitSingleton.getInstance();
        EagerInitSingleton eagerInitSingleton2 = EagerInitSingleton.getInstance();

        System.out.println("EagerInitSingleton Obj 1 Hashcode : " + eagerInitSingleton1.hashCode());
        System.out.println("EagerInitSingleton Obj 2 Hashcode : " + eagerInitSingleton2.hashCode());

    }

    private static void implementReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor[] constructors = LazyInitSingleton.class.getDeclaredConstructors();

        Constructor constructor = constructors[0];
        constructor.setAccessible(true); // making private constructor public

        LazyInitSingleton lazySingleton = (LazyInitSingleton) constructor.newInstance(); // creates a object by using public constructor created above
        LazyInitSingleton instance = LazyInitSingleton.getInstance();
        System.out.println("Reflected hashcode singleton :"+lazySingleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());

        //Solution - Create Singleton class using enums
        EnumSingleton.SINGLETON_INSTANCE.printMessage();
    }

}
