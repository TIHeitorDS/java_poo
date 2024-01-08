package extras.arrays.gradeBook2D;

public class GradeBookTest {
    public static void main(String[] args) {
        int[][] grades = {
                { 77, 88, 100 },
                { 100, 91, 71 },
                { 55, 60, 95 },
                { 10, 25, 45 },
                { 47, 68, 78 },
                { 51, 78, 55 },
                { 11, 100, 45 },
                { 100, 100, 95 },
                { 45, 98, 52 },
                { 95, 90, 80 }
        };

        GradeBook gradeBook = new GradeBook("OOP", grades);

        gradeBook.processGrades();
    }
}
