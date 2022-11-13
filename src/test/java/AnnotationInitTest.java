import static com.moascode.annotations.AnnotationInit.initialize;

public class AnnotationInitTest {
    public static void main(String[] args) throws Throwable {
        initialize("com.moascode.annotations.app",
                "com.moascode.annotations.app.configs",
                "com.moascode.annotations.app.databases",
                "com.moascode.annotations.app.http");
    }
}
