public class Person {
    
    // Instance variables.
    private String name;
    private int age;
    

    // Default constructor.
    public Person() {
        this(42, "Alice");
    }
    

    // Main constructor.
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    

    // String representation of object.
    public String toString() {
        return "My name is " + name + " and my age is " + age;
    }


    // Entry point of the program.
    public static void main(String[] args) {
        Person person = new Person("Bob", 55);
        System.out.println(person);
    }


    // Getters & setters.
    public int getAge() { return this.age; }
    public String getName() { return this.name; }
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }

}
