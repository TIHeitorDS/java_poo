package Yextras.arrays.gradeBook2D;

// GradeBook class uses an array2D to store grades
public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaximum() {
        int highGrade = grades[0][0];

        // loop into rows
        for (int studentGrades[] : grades) {
            // loop into columns
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    public int getMinimum() {
        int lowGrade = grades[0][0];

        // loop into rows
        for (int studentGrades[] : grades) {
            // loop into columns
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    // return the average from particular grades
    public double getAverage(int[] grades) {
        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.length;
    }

    public void outputBarChart() {
        System.out.println("\nOverall grade distribution:");

        int[] frequency = new int[11];

        for (int studentGrades[] : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.println("The grades are:\n");
        System.out.printf("           ");

        for (int i = 0; i < grades[0].length; i++) {
            System.out.printf("Test %d   ", i + 1);
        }

        System.out.println("Average");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }

            System.out.printf("%9.2f\n", getAverage(grades[student]));
        }
    }

    public void processGrades() {
        outputGrades();

        System.out.println();
        System.out.println("Lowest grade in the grade book is: " + getMinimum());
        System.out.println("Highest grade in the grade book is: " + getMaximum());
        
        outputBarChart();
    }
}
