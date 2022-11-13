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

import com.moascode.fields.jsonwriter.data.Address;
import com.moascode.fields.jsonwriter.data.Company;
import com.moascode.fields.jsonwriter.data.Person;

import static com.moascode.fields.FieldInspection.objectToJson;


/**
 * Json WriterMain.java
 * https://www.udemy.com/course/java-reflection-master-class
 */
public class FieldJsonWriterTest {
    public static void main(String[] args) throws IllegalAccessException {
        Company company = new Company("Udemy", "San Francisco", new Address("Harrison Street", (short) 600));
        Address address = new Address("Main Street", (short) 1);
        Person person = new Person("John", true, 29, 100.555f, address, company);

        String json = objectToJson(person, 0);

        System.out.println(json);
    }
}
