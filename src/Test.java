import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Professor> professors = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("If you're a Student enter 1");
            System.out.println("If you're a Professor enter 2");
            System.err.println("To print your info enter 3");
            System.out.println("To exit Enter 4");
            System.out.println();
            String input = in.next();
            System.out.println();
            switch (String.valueOf(input)) {
                case "1" -> {
                    System.out.println("Please Enter your name , birth date and major");
                    System.out.println();
                    if (students.isEmpty()) {
                        professors.clear();
                        students.add(new Student(in.next(), in.next(), in.next()));
                    }
                    else if (!students.isEmpty()) {
                        students.clear();
                        professors.clear();
                        students.add(new Student(in.next(), in.next(), in.next()));
                    }
                }
                case "2" -> {
                    System.out.println("Please Enter your name and birth date");
                    System.out.println();
                    if (professors.isEmpty()) {
                        students.clear();
                        professors.add(new Professor(in.next(), in.next()));
                    }
                    else if (!professors.isEmpty()) {
                        professors.clear();
                        students.clear();
                        professors.add(new Professor(in.next(), in.next()));
                    }
                }
                case "3" -> {
                    if (students.isEmpty() && professors.isEmpty()) {
                        System.out.println("No information to print");
                        System.out.println();
                    }
                    else if (students.isEmpty()) {
                        professors.get(0).printInfo();
                    }
                    else if (professors.isEmpty()) {
                        students.get(0).printInfo();
                    }
                }
                case "4" -> {
                    System.out.println("Exiting");
                    exit = true;
                }
                default -> System.out.println("Invalid number. please enter a number between 1-4");
            }
        }
    }
}
