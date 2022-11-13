import com.moascode.classes.ClassAnalyzer;
import com.moascode.classes.PopupTypeInfo;

import java.util.List;

public class ClassAnalyzerTest {
    public static void main(String... args) {
        System.out.println(ClassAnalyzer.createPopupTypeInfoFromClass(List.class));
        System.out.println(ClassAnalyzer.createPopupTypeInfoFromClass(int.class));
        System.out.println(ClassAnalyzer.createPopupTypeInfoFromClass(PopupTypeInfo.class));
    }
}
