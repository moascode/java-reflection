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

package com.moascode.proxies;

import com.moascode.proxies.impl.Cacheable;
import com.moascode.proxies.impl.NotImplementedException;
import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.util.Date;

public interface DatabaseReader {

    int countRowsInTable(String tableName) throws InterruptedException, IOException;

    String[] readRow(String sqlQuery) throws InterruptedException;

    default void connectToDatabase() { throw new NotImplementedException();}

    @Cacheable
    default String readCustomerIdByName(String firstName, String lastName) throws IOException {
        throw new NotImplementedException();
    }

    default int countRowsInCustomersTable() {
        throw new NotImplementedException();
    }

    default void addCustomer(String id, String firstName, String lastName) throws IOException {
        throw new NotImplementedException();
    }

    @Cacheable
    default Date readCustomerBirthday(String id) {
        throw new NotImplementedException();
    }
}
