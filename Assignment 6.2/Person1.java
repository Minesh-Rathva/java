public class Person1 {
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the Person object
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    // Example of how to use the Person class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30, "123 Main St");

        // Access and modify the address field
        System.out.println("Original Person: " + person);
        person.setAddress("456 Elm St");
        System.out.println("Updated Person: " + person);

        // Access other fields
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
