

public class DynamicArray {
    private int[] array;
    private int size;
    private int count;

    DynamicArray() {
        array = new int[1];
        size = 1;
        count = 0;
    }

    public void add(int elem) {
        if (size == count) {
            // grow the array
            growArray();
        }
        array[count] = elem;
        count++;
    }
    public void growArray() {
        int[] temp = array;
        array = new int[2*size];
        if (size >= 0) System.arraycopy(temp, 0, array, 0, size);
        size = 2*size;
    }


    public String toString()  {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]).append(", ");
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
         DynamicArray  dynamicArray = new DynamicArray();
         dynamicArray.add(1);
        System.out.println(dynamicArray);
        dynamicArray.add(2);
        System.out.println(dynamicArray);
        dynamicArray.add(3);
        System.out.println(dynamicArray);
        dynamicArray.add(4);
        System.out.println(dynamicArray);
    }
}
