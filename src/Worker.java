public class Worker {
    private String name;

    private int age;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public Worker(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    @Override
    public String toString() {
        return "возраст: " + age +
                ", пол: " + sex +
                ", имя: " + name + " ";
    }
}
