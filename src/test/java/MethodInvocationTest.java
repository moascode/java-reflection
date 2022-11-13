import com.moascode.methods.invocation.database.DatabaseClient;
import com.moascode.methods.invocation.http.HttpClient;
import com.moascode.methods.invocation.logging.FileLogger;
import com.moascode.methods.invocation.udp.UdpClient;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.moascode.methods.MethodInvocation.executeAll;
import static com.moascode.methods.MethodInvocation.groupExecutors;

public class MethodInvocationTest {
    public static void main(String[] args) throws Throwable {
        DatabaseClient databaseClient = new DatabaseClient();
        HttpClient httpClient1 = new HttpClient("123.456.789.0");
        HttpClient httpClient2 = new HttpClient("11.33.55.0");
        FileLogger fileLogger = new FileLogger();
        UdpClient udpClient = new UdpClient();

        String requestBody = "request data";

        List<Class<?>> methodParameterTypes = Arrays.asList(new Class<?>[]{String.class});

        Map<Object, Method> requestExecutors =
                groupExecutors(Arrays.asList(databaseClient, httpClient1, httpClient2, fileLogger, udpClient),
                        methodParameterTypes);

        executeAll(requestExecutors, requestBody);
    }
}
