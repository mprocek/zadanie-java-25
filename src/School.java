public class School {
    public static void main(String[] args) {
        Person person1 = new Student("Barbara", "Miła", 4, 1900);
        Person person2 = new Teacher("Józef", "Sporny", 11, 3400);

        person1.showInfo();
        person2.showInfo();
    }
}
