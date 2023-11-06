public class Professor extends Person {
    double salary = Math.floor(Math.random() * 100000); // hope you didn't fall for it

    Professor() {
    }

    public Professor(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary : " + this.salary + "$");
    }
}
