package singleton;

public enum EnumSingleton {
    SINGLETON_INSTANCE;

    public void printMessage() {
        System.out.println("Hello! from EnumSingleton. Hashcode - " + this.hashCode());
    }
}
