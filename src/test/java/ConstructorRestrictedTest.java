import com.moascode.constructors.restricted.webserver.ServerConfiguration;
import com.moascode.constructors.restricted.webserver.WebServer;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorRestrictedTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        initConfiguration();
        WebServer webServer = new WebServer();
        webServer.startServer();
    }

    public static void initConfiguration() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ServerConfiguration> constructor =
                ServerConfiguration.class.getDeclaredConstructor(int.class, String.class);

        constructor.setAccessible(true);
        constructor.newInstance(8080, "Good Day!");
    }
}
