package Task3;

public class Main {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2022, 8, 15);
        
        Student student1 = new Student("Alice", "123 Main St", "555-1234", "alice@example.com", Student.FRESHMAN);
        Faculty faculty1 = new Faculty("Dr. Smith", "456 College Ave", "555-5678", "smith@example.com", "Room 101", 80000, hireDate, "MWF 9-11 AM", "Professor");
        Staff staff1 = new Staff("John Doe", "789 University Blvd", "555-8765", "johndoe@example.com", "Room 202", 50000, hireDate, "Administrator");

        System.out.println(student1);
        System.out.println(faculty1);
        System.out.println(staff1);
    }
}

