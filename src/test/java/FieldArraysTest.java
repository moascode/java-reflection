import static com.moascode.fields.Arrays.inspectArrayObject;
import static com.moascode.fields.Arrays.inspectArrayValues;

public class FieldArraysTest {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {1, 2};

        double[][] towDimensionalArray = {{1.5, 2.5}, {3.5, 4.5}};

        inspectArrayObject(towDimensionalArray);

        inspectArrayValues(towDimensionalArray);
    }
}
