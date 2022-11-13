import com.moascode.constructors.Constructors;

import java.lang.reflect.InvocationTargetException;

import static com.moascode.constructors.Constructors.createInstanceWithArguments;
import static com.moascode.constructors.Constructors.printConstructorsData;

public class ConstructorsTest {
    public static void main(String [] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        printConstructorsData(Constructors.Person.class);

        Constructors.Address address = createInstanceWithArguments(Constructors.Address.class, "First Street", 10);

        Constructors.Person person = createInstanceWithArguments(Constructors.Person.class,  address, "John", 20);
        System.out.println(person);
    }
}
