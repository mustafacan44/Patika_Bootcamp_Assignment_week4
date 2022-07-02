package Thread;

import Entity.Student;
import Services.FileService;
import Services.ThreadService;

public class ThreadWrite implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);

            if (ThreadService.isControl) {
                //Okuma işlemi tamamalandığında if bloğuna girilir. Dosya ekrana yazdırılır.

                FileService fileService = new FileService();
                fileService.readJSON();
                System.out.println("Okuma işlemi tamamlandı. Ekrana Yazdırılıyor....");
                for (Student s : fileService.readJSON()) {
                    System.out.println("name : " + s.getName() + " surname : " + s.getSurname() + " age : " + s.getAge());
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

