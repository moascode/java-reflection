package com.moascode.annotations.app;

import com.moascode.annotations.annotations.Annotations.*;
import com.moascode.annotations.annotations.OperationType;
import com.moascode.annotations.annotations.Role;
import com.moascode.fields.jsonwriter.data.Person;

@Permissions(role = Role.CLERK, allowed = OperationType.READ)
@Permissions(role = Role.MANAGER, allowed = {OperationType.READ, OperationType.WRITE})
@Permissions(role = Role.SUPPORT_ENGINEER, allowed = {OperationType.READ, OperationType.WRITE, OperationType.DELETE})
public class CompanyDataStore {
    private Person user;

    public void CompanyDataStore(Person user) {
        this.user = user;
    }

    // Different Database access operations
}
