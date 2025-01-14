package com.java.functionalinterface;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Reviews.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Review {
     String review();
     String date();
     String Comment();
}
