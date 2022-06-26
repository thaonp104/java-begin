package JavaReflection;

public class Girl {
    private String name;
    private Integer age;

    public Girl() {

    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                '}';
    }
}
