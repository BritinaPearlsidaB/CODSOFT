import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();
        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.printf("Enter marks of subject %d: ", i + 1);
            marks[i] = sc.nextInt();
        }
        
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        
        int average = total/ subjects;
        
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
      
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: "+average+"%%");
        System.out.println("\nGrade: " + grade);
        
        sc.close();
    }
}

    