package fourth;

public class Pet {
 
    private String name;
    private String breed;
    private int age;

    public Pet() {
        this.name = "no name";
    }

    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet: " + "name=" + name + ", breed=" + breed + ", age=" + age + '.';
    } 
   
}



