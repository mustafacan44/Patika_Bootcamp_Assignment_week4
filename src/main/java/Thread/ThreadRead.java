package Thread;

import Services.FileService;

public class ThreadRead implements Runnable {


    @Override
    public void run() {
        try {
            System.out.println("Dosya Okuma işlemi başladı....");
            FileService fileService = new FileService();
            fileService.readJSON();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

