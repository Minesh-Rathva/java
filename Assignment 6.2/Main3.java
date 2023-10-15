public class Main3 {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("John Doe", 30, "123 Main St");
        Person person2 = new Person("Jane Smith", 25, "456 Elm St");

        // Change the address of Person 1
        person1.setAddress("789 Oak Ave");

        // Display updated information of Person 1
        System.out.println("Updated Person 1 Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        // Display information of Person 2
        System.out.println("\nPerson 2 Details:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());
    }
}
