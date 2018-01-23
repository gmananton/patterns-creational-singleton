/**
 * Created by Anton Mikhaylov on 23.01.2018.
 * При корректной реализации синхронизированного синглтона попытки создания разных экземпляров
 * из различных потоков должны приводить к возврату одного и того же объекта и мы должны увидеть
 * одинаковое имя
 */
public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            MySingleton singleton = MySingleton.getInstance("SingletonName1");
            System.out.println("Singleton created from thread " + Thread.currentThread().getName() + " has name " + singleton.getName());
        });

        Thread t2 = new Thread(() -> {
            MySingleton singleton = MySingleton.getInstance("SingletonName2");
            System.out.println("Singleton created from thread " + Thread.currentThread().getName() + " has name " + singleton.getName());
        });

        t1.start();
        t2.start();
    }

}
