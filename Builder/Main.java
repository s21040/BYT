import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person p = pb.create()
                .setName("Sokolinyj")
                .setSurname("Glaz")
                .setStatus("married")
                .setGender("bisexual")
                .setAge(5)
                .build();
        System.out.println(p.toString());
        Person p1 = pb.create()
                .setName("Natalia")
                .setSurname("Romanow")
                .setStatus("widow")
                .setGender("genderfluid")
                .setAge(30)
                .addChild(p)
                .build();
        System.out.println(p1.toString());

    }
}
class Person{
    public String name;
    public String surname;
    public int age;
    public String status;
    public String gender;
    public ArrayList<Person>children;

    @Override
    public String toString() {
        return "Person" +
                "\n name='" + name + '\'' +
                "\n surname='" + surname + '\'' +
                "\n age=" + age +
                "\n status='" + status + '\'' +
                "\n gender='" + gender + '\'' +
                "\n children=" + children +
                "\n";
    }
}
class PersonBuilder{
    private Person p;

    public Person build(){
        return p;
    }

    public PersonBuilder create() {
        p = new Person();
        return this;
    }

    public PersonBuilder setName(String name) {
        p.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        p.surname=surname;
        return this;
    }
    public PersonBuilder setAge(int age){
        p.age=age;
        return this;
    }
    public PersonBuilder setStatus(String status){
        p.status=status;
        return this;
    }

    public PersonBuilder setGender(String gender){
        p.gender=gender;
        return this;
    }

    public PersonBuilder addChild(Person child){
        if (p.children == null){
            p.children = new ArrayList<>();
        }
        p.children.add(child);
        return this;
    }

}
