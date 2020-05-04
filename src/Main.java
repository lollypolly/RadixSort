import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println(Paths.get("").toAbsolutePath().toString());
            WriteData data = new WriteData();
            BufferedReader reader = new BufferedReader(new FileReader(Paths.get("").resolve("data.txt").toString()));
            String values = reader.readLine();
            int c1 = Integer.parseInt(values.split(" ")[0].trim()),
                c2 = Integer.parseInt(values.split(" ")[1].trim()),
                c3 = Integer.parseInt(values.split(" ")[2].trim()),
                c4 = Integer.parseInt(values.split(" ")[0].trim());

            ArrayList<int[]> arr1 = new ArrayList<>(c1);
            ArrayList<char[]> arr2 = new ArrayList<>(c2);
            ArrayList<LinkedList<Integer>> arr3 = new ArrayList<>(c3);
            ArrayList<LinkedList<Character>> arr4 = new ArrayList<>(c4);

            for (int i = 0; i < c1; i++) {
                arr1.add(new int[Integer.parseInt(reader.readLine().trim())]);
                values = reader.readLine();
                for (int j = 0; j < arr1.get(i).length; j++) {
                    arr1.get(i)[j] = Integer.parseInt(values.split(" ")[j].trim());
                }
                long msStart = System.currentTimeMillis();
                String iter = RadixSort.radixSortInt(arr1.get(i));
                System.out.println("Массив номер [" + (i + 1) + "] типа [int] отсортирован за: "
                        + (System.currentTimeMillis() - msStart) + " миллисекунд(ы). Кол-во иттераций: " + iter
                        + ". Размер массива: " + arr1.get(i).length);
                // System.out.println(Arrays.toString(arr1.get(i)));
            }

            for (int i = 0; i < c2; i++) {
                arr2.add(new char[Integer.parseInt(reader.readLine().trim())]);
                values = reader.readLine();
                for (int j = 0; j < arr2.get(i).length; j++) {
                    arr2.get(i)[j] = values.split(" ")[j].trim().charAt(0);
                }
                long msStart = System.currentTimeMillis();
                String iter = RadixSort.radixSortChar(arr2.get(i));
                System.out.println("Массив номер [" + (i + 1) + "] типа [char] отсортирован за: "
                        + (System.currentTimeMillis() - msStart) + " миллисекунд(ы). Кол-во иттераций: " + iter
                        + ". Размер массива: " + arr2.get(i).length);
                // System.out.println(Arrays.toString(arr2.get(i)));
            }

            for (int i = 0; i < c3; i++) {
                int size = Integer.parseInt(reader.readLine().trim());
                arr3.add(new LinkedList<>());
                values = reader.readLine();
                for (int j = 0; j < size; j++) {
                    arr3.get(i).add(Integer.parseInt(values.split(" ")[j].trim()));
                }
                long msStart = System.currentTimeMillis();
                String iter = RadixSort.radixLinkedSort(arr3.get(i));
                System.out.println("Массив номер [" + (i + 1) + "] типа [LinkedList<Integer>] отсортирован за: "
                        + (System.currentTimeMillis() - msStart) + " миллисекунд(ы). Кол-во иттераций: " + iter
                        + ". Размер массива: " + arr3.get(i).size());
                // System.out.println(arr3.get(i));
            }

            for (int i = 0; i < c4; i++) {
                int size = Integer.parseInt(reader.readLine().trim());
                arr4.add(new LinkedList<>());
                values = reader.readLine();
                for (int j = 0; j < size; j++) {
                    arr4.get(i).add(values.split(" ")[j].trim().charAt(0));
                }
                long msStart = System.currentTimeMillis();
                String iter = RadixSort.radixLinkedSortChar(arr4.get(i));
                System.out.println("Массив номер [" + (i + 1) + "] типа [LinkedList<Char>] отсортирован за: "
                        + (System.currentTimeMillis() - msStart) + " миллисекунд(ы). Кол-во иттераций: " + iter
                        + ". Размер массива: " + arr4.get(i).size());
                // System.out.println(arr4.get(i));
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
