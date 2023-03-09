public class Manager extends Worker {
    private int salary;
    private int numberWorkingHoursPerDay;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumberWorkingHoursPerDay() {
        return numberWorkingHoursPerDay;
    }

    public void setNumberWorkingHoursPerDay(int numberWorkingHoursPerDay) {
        this.numberWorkingHoursPerDay = numberWorkingHoursPerDay;
    }

    public Manager(int age, String sex, String name, int salary, int numberWorkingHoursPerDay) {
        super(age, sex, name);
        this.salary = salary;
        this.numberWorkingHoursPerDay = numberWorkingHoursPerDay;
    }

    @Override
    public String toString() {
        return "Менеджер - " +
                super.toString() +
                "зарпалата: " + salary +
                ", рабочих часов в день: " + numberWorkingHoursPerDay;
    }
}
