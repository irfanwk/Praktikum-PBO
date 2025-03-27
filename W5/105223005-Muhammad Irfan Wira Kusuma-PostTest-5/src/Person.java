class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }
    public void display() {
       System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private double salary;
    public Employee (String n, int a, double s) { //berdasarkan pesan error di VSC harusny terdapat super constructor yang memiliki 2 parameter untuk mengisi n dan a sesuai dengna classs person di atas dan bisa memanggil konstruktor person
        super(n, a);
        salary = s;
    }
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}
   