/*
 *  MIT License
 *
 *  Copyright (c) 2020 Michael Pogrebinsky - Java Reflection - Master Class
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

import com.moascode.fields.configparser.data.GameConfig;
import com.moascode.fields.configparser.data.UserInterfaceConfig;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;

import static com.moascode.fields.FieldModification.createConfigObject;
/**
 * Config Parser
 * https://www.udemy.com/course/java-reflection-master-class
 */
public class FieldModificationTest {

    private static final Path GAME_CONFIG_PATH = Path.of(Constants.ROOT_PATH, Constants.CLASS_PATH, "fields/configparser/resources/game-properties-array.cfg");
    private static final Path UI_CONFIG_PATH = Path.of(Constants.ROOT_PATH, Constants.CLASS_PATH, "fields/configparser/resources/user-interface-array.cfg");

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        GameConfig gameConfig = createConfigObject(GameConfig.class, GAME_CONFIG_PATH);
        UserInterfaceConfig interfaceConfig = createConfigObject(UserInterfaceConfig.class, UI_CONFIG_PATH);

        System.out.println(gameConfig);
        System.out.println(interfaceConfig);
    }
}
