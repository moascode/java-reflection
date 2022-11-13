import com.moascode.fields.ArrayReader;

public class FieldArrayReaderTest {
    public static void main(String[] args) {
        int [] input = new int[] {0, 10, 20, 30, 40};
        System.out.println(ArrayReader.getArrayElement(input, 3));
        System.out.println(ArrayReader.getArrayElement(input, -1));
        String[] names = new String[] {"John", "Michael", "Joe", "David"};
        System.out.println(ArrayReader.getArrayElement(names, 2));
        System.out.println(ArrayReader.getArrayElement(names, -1));
    }
}
