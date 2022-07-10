public class SingletonExample {

    public static void main(String[] args) {

        singleton instance = singleton.getInstance();
        System.out.println(instance);
        singleton secondInstance = singleton.getInstance();
        System.out.println(secondInstance);

    }

    }
