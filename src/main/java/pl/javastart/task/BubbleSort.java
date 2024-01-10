package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int n = inputArray.length;
        boolean swapped;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    swapped = true;
                }
            }
            // Jeśli w jednym przejściu pętli nie było żadnej zamiany, to tablica jest już posortowana
            if (!swapped) {
                break;
            }
        }
        return comparisons;
    }
}
