import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        single threaded
//        Singleton s1 = Singleton.getSingletonInstance();
//        Singleton s2 = Singleton.getSingletonInstance();
//
//        System.out.println(s1);
//        System.out.println(s2);

//multi-threaded
        ExecutorService svc = Executors.newFixedThreadPool(2);

        svc.submit(Singleton::getSingletonInstance);
        svc.submit(Singleton::getSingletonInstance);
        svc.submit(Singleton::getSingletonInstance);
    }


}