
public class Main {
    String studentName = "Zaid";
    String rollNumber = "20B-052-SE";

    public static void main(String[] args) {
        Main mainObject = new Main();

        System.out.println("\n---------- Task 1 ----------");
        task1 task1Object = new task1();
        System.out.println(task1Object.AI + task1Object.SDC);
        System.out.println(mainObject.studentName);
        System.out.println(mainObject.rollNumber);

        System.out.println("\n---------- Task 2 ----------");
        task2 task2Object = new task2();
        System.out.println("The highest age found is: " + task2Object.person);

        System.out.println("\n---------- Task 3 ----------");
        task3 task3Object = new task3();

        System.out.println("\n---------- Task 4 ----------");
        task4 task4Object = new task4();

        System.out.println("\n---------- Task 5 ----------");
        task5 task5Object = new task5();
        System.out.println("The sum is: " + task5Object.getRes());
    }
}

