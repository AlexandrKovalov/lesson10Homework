public class Secretary extends Worker {
    private int salary;
    private int numberWorkingHoursPerDay;

    public int getSecretarySalary() {
        return salary;
    }

    public void setSecretarySalary(int secretarySalary) {
        this.salary = secretarySalary;
    }

    public int getNumberWorkingHoursPerDay() {
        return numberWorkingHoursPerDay;
    }

    public void setNumberWorkingHoursPerDay(int numberWorkingHoursPerDay) {
        this.numberWorkingHoursPerDay = numberWorkingHoursPerDay;
    }

    public Secretary(int age, String sex, String name, int salary, int numberWorkingHoursPerDay) {
        super(age, sex, name);
        this.salary = salary;
        this.numberWorkingHoursPerDay = numberWorkingHoursPerDay;
    }

    @Override
    public String toString() {
        return "Секретарь - " +
                super.toString() +
                " зарплата= " + salary +
                ", рабочих часов в день: " + numberWorkingHoursPerDay;
    }
}
