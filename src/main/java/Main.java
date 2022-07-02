import Thread.*;
public class Main {
    public static void main(String[] args) {
        ThreadRead threadRead = new ThreadRead();
        //Dosyanın okunması için thread oluşturulur.

        ThreadWrite threadWrite = new ThreadWrite();
        //Dosyadan okunan verileri yazdırmak için bir thread oluşturulur.

        Thread thread = new Thread(threadRead);
        thread.start(); // dosyayı okumak için thread başlatılır

        Thread thread1 = new Thread(threadWrite);
        thread1.start();// Okunan dosyayı yazdırmak için thread başlatılır.
    }
}
