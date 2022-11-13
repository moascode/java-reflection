import com.moascode.annotations.app.SqlQueryBuilder;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.moascode.annotations.AnnotationField.execute;

public class AnnotationFieldTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        SqlQueryBuilder sqlQueryBuilder = new SqlQueryBuilder(Arrays.asList("1", "2", "3"),
                10,
                "Movies",
                Arrays.asList("Id", "Name"));

        String sqlQuery = execute(sqlQueryBuilder);
        System.out.println(sqlQuery);
    }
}
