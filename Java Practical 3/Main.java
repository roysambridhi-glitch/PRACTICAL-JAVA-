interface Gross {
    void calculate();
}

class Employee {
    int emp_no;
    String name;

    void getDetails() {
        emp_no = 1090;
        name = "Tridha";
    }
}

class Salary extends Employee implements Gross {
    double basic_pay, DA, HRA, gross_salary;

    public void calculate() {
        basic_pay = 30000;
        DA = basic_pay * 40 / 100;
        HRA = basic_pay * 20 / 100;
        gross_salary = basic_pay + DA + HRA;
    }

    void display() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Salary s = new Salary();

        s.getDetails();
        s.calculate();
        s.display();
    }
}