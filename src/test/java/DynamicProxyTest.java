import com.moascode.proxies.DatabaseReader;
import com.moascode.proxies.impl.DatabaseReaderImpl;

import java.util.ArrayList;
import java.util.List;

import static com.moascode.proxies.DynamicProxy.*;

public class DynamicProxyTest {
    public static void main(String[] args) throws InterruptedException {
        DatabaseReader databaseReader = createProxy(new DatabaseReaderImpl());

        useDatabaseReader(databaseReader);

        List<String> listOfGreetings = new ArrayList<>();

        listOfGreetings.add("hello");
        listOfGreetings.add("good morning");
        listOfGreetings.remove("hello");
    }
}
