import com.moascode.annotations.app.BestGamesFinder;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static com.moascode.annotations.AnnotationParameter.execute;

public class AnnotationParameter {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        BestGamesFinder bestGamesFinder = new BestGamesFinder();

        List<String> bestGamesInDescendingOrder = execute(bestGamesFinder);

        System.out.println(bestGamesInDescendingOrder);
    }
}
