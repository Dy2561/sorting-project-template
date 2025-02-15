import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] testInput = generateRandomArray(10); 

        TestSuite.run(testInput, 10); 
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100); 
        }
        return array;
    }
}
