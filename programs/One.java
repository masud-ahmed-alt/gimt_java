package programs;

import java.util.Scanner;

class One {
    private static String QNS = "Write a Menu Driven Program in Java which"
            + "accepts the marks of 3 students into a 1- Dimensional array and";

    public static void main(String[] args) {
        System.out.println(QNS);
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean shouldFinish = false;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        while (!shouldFinish) {
            System.out.println("\n***Please Select an option***" + "\n\t1. Add Student" + "\n\t2. Display Student"
                    + "\n\t3. Exit ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student1.insert();
                    student2.insert();
                    student3.insert();
                    break;
                case 2:
                    student1.display();
                    student2.display();
                    student3.display();
                    break;
                default:
                    System.out.println("Program Terminated");
                    shouldFinish = true;
                    break;
            }
        }
    }

    static class Student {
        private int[] marks = new int[5];
        private String name;
        private double per;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        public void insert() {
            System.out.println("__________________");
            System.out.println("Enter name : ");
            name = in.next();
            System.out.println("**Enter Marks**");
            for (int i = 0; i < 5; i++) {
                System.out.println("Marks of Subject " + (i + 1));
                marks[i] = in.nextInt();
                sum = sum + marks[i];
                per = (float) sum / 5;
            }
        }

        public void display() {
            System.out.println("Name : " + name);
            System.out.println("Total Marks : " + sum);
            System.out.println("Percentage: " + per);
            System.out.println("_________________");
        }
    }
}