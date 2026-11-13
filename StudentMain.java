import java.util.Scanner;

interface Department {
    void printDepartment();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberofRooms;

    void getHostel() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberofRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostel() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberofRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, electiveSubject;
    int regdNo;
    double avgMarks;
    String deptName, deptHead;

    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();

        System.out.print("Enter Department Head: ");
        deptHead = sc.nextLine();

        getHostel();
    }

    public void printDepartment() {
        System.out.println("Department: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printDepartment();
        printHostel();
    }

    void migrate() {
        System.out.println("Enter New Hostel Details:");
        getHostel();
        System.out.println("Student Migrated Successfully!");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[50];

        int count = 0, choice, reg;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    students[count] = new Student();
                    students[count].getData();
                    count++;
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    reg = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo == reg) {
                            students[i].migrate();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");

                    break;

                case 3:
                    System.out.print("Enter Registration Number: ");
                    reg = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo == reg) {
                            students[i].printData();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");

                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
