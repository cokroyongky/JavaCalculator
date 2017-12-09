public class BelajarThread extends Thread {
    public static void main(String[] args) {
//        Cek nama
//        System.out.println(Thread.currentThread().getName());

        Thread threadMain = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        threadMain.start();
        thread1.start();
        thread2.start();
    }
}
