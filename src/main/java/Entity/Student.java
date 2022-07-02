package Entity;

public class Student {

    //Bilgiler bu class'ta tutulur.
    private String name;
    private String surname;
    private String age;

    //Constructor

    public Student(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Student(){

    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }
}
