import com.moascode.annotations.AnnotationDiscovery;
import com.moascode.annotations.app.AutoSaver;

public class AnnotationDiscoveryTest {
    public static void main(String[] args) {
        System.out.println(AnnotationDiscovery.getAllAnnotatedMethods(AnnotationDiscovery.UseAnnotation.class));
    }
}
