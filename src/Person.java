public class Person {
    String name;
    String birthDate;
    Person(){}
    Person(String name, String birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    public void printInfo() {
        System.out.println("Name : "+ this.name);
        System.out.println("BirthDate : "+ this.birthDate);
    }
}
