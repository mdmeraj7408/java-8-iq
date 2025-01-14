package com.java.functionalinterface;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role{
    String value();
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles{
Role[] value();
}
@Role("Java Developer")
@Role("Manager")
@Role("Lead")
public class EmployeeRoles {
    public static void main(String[] args) {
        if(EmployeeRoles.class.isAnnotationPresent(Roles.class)){
            Roles annotation = EmployeeRoles.class.getAnnotation(Roles.class);
            for (Role r:annotation.value()){
                System.out.println("Role: "+r.value());
            }
        }else {
            System.out.println("No Roles Annotation present.");
        }
    }
}
