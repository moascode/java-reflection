import com.moascode.fields.Fields;

import java.lang.reflect.Field;

import static com.moascode.fields.Fields.printDeclaredFieldsInfo;

public class FieldsTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Fields.Movie movie = new Fields.Movie("Lord of the Rings",
                2001,
                12.99,
                true,
                Fields.Category.ADVENTURE);

        printDeclaredFieldsInfo(Fields.Category.class, movie);

        Field minPriceStaticField = Fields.Movie.class.getDeclaredField("MINIMUM_PRICE");

        System.out.println(String.format("static MINIMUM_PRICE value :%f", minPriceStaticField.get(null)));
    }
}
