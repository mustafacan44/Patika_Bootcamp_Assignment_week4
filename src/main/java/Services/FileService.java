package Services;

import Entity.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileService {
    public List<Student> readJSON() {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> studentList = null;

        /*
        JSON içeriğini bir Java nesnesine ayrıştırmak veya seri durumdan çıkarmak için kullanabiliriz
        Burada okuma işlemi read value ile yapılır.
        */
        try {
            studentList = mapper.readValue(new File("src/main/resources/students.json"), new TypeReference<List<Student>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        ThreadService.isControl = true;
        return studentList;
    }
}
