import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[3];
        students[0] = new Student("Alice", "2023", "Computer Science", "Engineering", 20, "123-456-7890");
        students[1] = new Student("Bob", "2022", "Mathematics", "Science", 21, "987-654-3210");
        students[2] = new Student("Charlie", "2023", "Physics", "Engineering", 19, "555-123-4567");

        System.out.println("Names of all students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.print("Enter the needed faculty: ");
        String fac = in.nextLine();
        System.out.printf("Students of %s faculty:\n", fac);
        boolean foundFac = false;
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(fac)) {
                System.out.println(student.getName());
                foundFac = true;
            }
        }
        if (!foundFac) {
            System.out.println("No students found for this faculty.");
        }

        System.out.print("Enter the needed year of the entrance: ");
        int Year = in.nextInt();
        System.out.printf("Students who entered after %d:\n",Year);
        boolean fYear = false;
        for (Student student : students) {
            int a = Integer.parseInt(student.getEnterDate());
            if (a > Year) {
                System.out.println(student.getName());
                fYear = true;
            }
        }
        if (!fYear) {
            System.out.println("No students found who entered after this year.");
        }
    }
}

class Person {
    private int age;
    private String name;
    private String phone;

    public Person(int age, String name, String phone) {
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}

class Student extends Person {
    private String enterDate;
    private String course;
    private String faculty;

    public Student(String name, String enterDate, String course, String faculty, int age, String phone) {
        super(age, name, phone);
        this.enterDate = enterDate;
        this.course = course;
        this.faculty = faculty;
    }

    public String getEnterDate() {
        return this.enterDate;
    }

    public String getFaculty() {
        return this.faculty;
    }
}
