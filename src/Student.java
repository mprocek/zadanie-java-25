public class Student extends Person {
    private int yearOfStudy;
    private int scholarship;

    public Student(String firstName, String lastName, int yearOfStudy, int scholarship){
        super(firstName, lastName);
        this.yearOfStudy=yearOfStudy;
        this.scholarship=scholarship;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Rok: " + yearOfStudy + " Stypendium: " + scholarship);
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}
