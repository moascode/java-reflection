import com.moascode.interfaces.FindInterfaces;

import java.io.PrintStream;
import java.util.List;
import java.util.TreeSet;

public class FindInterfacesTest {
    public static void main(String... args) {
        System.out.println(FindInterfaces.findAllImplementedInterfaces(List.class));
        System.out.println(FindInterfaces.findAllImplementedInterfaces(PrintStream.class));
        System.out.println(FindInterfaces.findAllImplementedInterfaces(TreeSet.class));
    }
}
