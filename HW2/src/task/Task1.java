package task;

import java.io.FileWriter;
import java.io.IOException;

    public class Task1 {

        public static void main() {
            int[] array = {5, 3, 8, 4, 2};
            bubbleSort(array);
        }

        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;
            try (FileWriter writer = new FileWriter("log.txt")) {
                for (int i = 0; i < n - 1; i++) {
                    swapped = false;
                    for (int j = 0; j < n - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    writer.write("Iteration " + (i + 1) + ": ");
                    for (int j : array) {
                        writer.write(j + " ");
                    }
                    writer.write("\n");
                    if (!swapped) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

