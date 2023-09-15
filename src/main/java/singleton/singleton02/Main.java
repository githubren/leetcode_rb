package singleton.singleton02;

public class Main {

    public static void main(String[] args){
//        SingletonTest02 singletonTest02_1 = SingletonTest02.getInstance01();
//        SingletonTest02 singletonTest02_2 = SingletonTest02.getInstance01();
//        System.out.println(singletonTest02_1.equals(singletonTest02_2));
//        System.out.println(singletonTest02_1 == singletonTest02_2);
//        System.out.println(singletonTest02_1.hashCode());
//        System.out.println(singletonTest02_2.hashCode());
//        System.out.println("**********************");

        Thread thread1 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程1 hashcode："+thread.hashCode());
        });
        Thread thread2 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程2 hashcode："+thread.hashCode());
        });
        Thread thread3 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程3 hashcode："+thread.hashCode());
        });
        Thread thread4 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程4 hashcode："+thread.hashCode());
        });
        Thread thread5 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程5 hashcode："+thread.hashCode());
        });
        Thread thread6 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程6 hashcode："+thread.hashCode());
        });
        Thread thread7 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程7 hashcode："+thread.hashCode());
        });
        Thread thread8 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程8 hashcode："+thread.hashCode());
        });
        Thread thread9 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程9 hashcode："+thread.hashCode());
        });
        Thread thread10 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance01();
            System.out.println("线程10 hashcode："+thread.hashCode());
        });


        Thread thread11 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程11 hashcode："+thread.hashCode());
        });
        Thread thread12 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程12 hashcode："+thread.hashCode());
        });
        Thread thread13 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程13 hashcode："+thread.hashCode());
        });
        Thread thread14 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程14 hashcode："+thread.hashCode());
        });
        Thread thread15 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程15 hashcode："+thread.hashCode());
        });
        Thread thread16 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程16 hashcode："+thread.hashCode());
        });
        Thread thread17 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程17 hashcode："+thread.hashCode());
        });
        Thread thread18 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程18 hashcode："+thread.hashCode());
        });
        Thread thread19 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程19 hashcode："+thread.hashCode());
        });
        Thread thread20 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance02();
            System.out.println("线程20 hashcode："+thread.hashCode());
        });

        Thread thread21 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程21 hashcode："+thread.hashCode());
        });
        Thread thread22 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程22 hashcode："+thread.hashCode());
        });
        Thread thread23 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程23 hashcode："+thread.hashCode());
        });
        Thread thread24 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程24 hashcode："+thread.hashCode());
        });
        Thread thread25 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程25 hashcode："+thread.hashCode());
        });
        Thread thread26 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程26 hashcode："+thread.hashCode());
        });
        Thread thread27 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程27 hashcode："+thread.hashCode());
        });
        Thread thread28 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程28 hashcode："+thread.hashCode());
        });
        Thread thread29 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程29 hashcode："+thread.hashCode());
        });
        Thread thread30 = new Thread(() ->{
            SingletonTest02 thread = SingletonTest02.getInstance03();
            System.out.println("线程30 hashcode："+thread.hashCode());
        });

//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();
//
//        thread11.start();
//        thread12.start();
//        thread13.start();
//        thread14.start();
//        thread15.start();
//        thread16.start();
//        thread17.start();
//        thread18.start();
//        thread19.start();
//        thread20.start();

        thread21.start();
        thread22.start();
        thread23.start();
        thread24.start();
        thread25.start();
        thread26.start();
        thread27.start();
        thread28.start();
        thread29.start();
        thread30.start();
    }
}
