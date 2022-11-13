import com.moascode.modifiers.JsonWriterSerializer;
import com.moascode.modifiers.data.Address;

public class ModifierJsonWriterSerializerTest {
    public static void main(String[] args) throws IllegalAccessException {
        Address address = new Address("Main Street", (short) 1, "12345");
        System.out.println(JsonWriterSerializer.objectToJson(address));
    }
}
