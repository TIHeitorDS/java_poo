package extras.arrays;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = { 1, 2, 2, 3, 4, 5, 1, 5, 2, 2, 3, 3, 6 };
        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("Responses[%d] = %d\n", answer, responses[answer]);
            }
        }

        System.out.println("Rating\tFrequency");

        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%d\t%d\n", i, frequency[i]);
        }
    }
}
