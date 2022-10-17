public class Person {
    private final String surname;
    private final String name;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
