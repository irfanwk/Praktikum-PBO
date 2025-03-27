package comUniversityMain;

import comUniversityModel.Student;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);
        students[3] = new Student("105223005", "miwk", 19, 3.98);
        students[4] = new Student("105223000", "Rakan", 18, 4);

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Nama: " + student.getName() + ", Umur: " + student.getAge() + ", GPA: " + student.getGpa());
        }
    }
}
