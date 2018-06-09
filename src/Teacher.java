public class Teacher extends Person {
    private int yearOfExperience;
    private int salary;

    public Teacher(String firstName, String lastName, int yearOfExperience, int salary){
        super(firstName,lastName);
        this.yearOfExperience=yearOfExperience;
        this.salary=salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Staż: " + yearOfExperience + " Wynagrodzenie: " + salary);
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
