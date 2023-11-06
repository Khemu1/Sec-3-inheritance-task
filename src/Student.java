public class Student extends Person {
    String major;
    Student(){}

    public Student(String name,String birthDate,String major) {
        super(name, birthDate);
        this.major = major;
    }
    
    @Override
    public void printInfo()    {
    super.printInfo();
    System.out.println("Major : "+this.major);
    }
}
