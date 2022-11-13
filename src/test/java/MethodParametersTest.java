import com.moascode.methods.parameters.ClothingProduct;

import static com.moascode.methods.MethodParameters.testGetters;
import static com.moascode.methods.MethodParameters.testSetters;

public class MethodParametersTest {
    public static void main(String[] args) {
        testGetters(ClothingProduct.class);
        testSetters(ClothingProduct.class);
    }
}
