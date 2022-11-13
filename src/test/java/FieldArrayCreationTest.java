import com.moascode.fields.configparser.data.GameConfigArray;
import com.moascode.fields.configparser.data.UserInterfaceConfigArray;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;

import static com.moascode.fields.FieldArrayCreation.createConfigObject;

public class FieldArrayCreationTest {
    private static final Path GAME_CONFIG_PATH = Path.of(Constants.ROOT_PATH, Constants.CLASS_PATH, "fields/configparser/resources/game-properties-array.cfg");
    private static final Path UI_CONFIG_PATH = Path.of(Constants.ROOT_PATH, Constants.CLASS_PATH, "fields/configparser/resources/user-interface-array.cfg");

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        GameConfigArray gameConfigArray = createConfigObject(GameConfigArray.class, GAME_CONFIG_PATH);
        UserInterfaceConfigArray interfaceConfigArray = createConfigObject(UserInterfaceConfigArray.class, UI_CONFIG_PATH);

        System.out.println(gameConfigArray);
        System.out.println(interfaceConfigArray);
    }
}
