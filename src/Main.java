public class Main {
    public static void main(String[] args) {
        Secretary masha = new Secretary(25, "Female", "Masha", 120000, 8 );
        System.out.println(masha.toString());
        Manager sasha = new Manager(22, "male", "Sasha", 80000, 6);
        System.out.println(sasha.toString());
        Programmer natasha = new Programmer(28, "Female", "Natasha", 500000, 5);
        System.out.println(natasha.toString()); //не понимает кириллицу
    }
}