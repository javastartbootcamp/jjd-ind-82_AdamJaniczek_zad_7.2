package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int n = inputArray.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                count++;
                if (inputArray[j] > inputArray[j + 1]) {
                    // Zamiana miejscami gdy wartość jest większa
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        return count;
    }
}
