public class Singleton {

    private Singleton(){
        System.out.println("Singleton object instantiated");
    };

    private static Singleton singleton = null;

//for a single threaded env
//    public static Singleton getSingletonInstance() {
//        if(singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    public static Singleton getSingletonInstance() {
        System.out.println("Accessing singleton instance");
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
