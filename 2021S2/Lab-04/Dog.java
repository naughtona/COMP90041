public class Dog {

    // Instance variables.
    private String name;
    private int age;


    // A constructor.
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // A method.
    public void greet() {
        System.out.println("Woof! My name is " + name + " and I'm " + age + " years old!");
    }


    // Entry point of the program.
    public static void main(String[] args) {
        Dog dog = new Dog("Barry", 5);
        dog.greet();
    }


    // Getters.
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    
    // Setters.
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

}
