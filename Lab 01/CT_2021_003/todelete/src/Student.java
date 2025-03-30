// Define Student class
public class Student {
    private String name;
    private int age;

    // Constructor: Initializes name and age
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

