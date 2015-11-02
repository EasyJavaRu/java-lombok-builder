package ru.easyjava.java;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Sample person entity.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Person {

    /**
     * Some id;
     */
    @NonNull
    Integer id;

    /**
     * Person name
     */
    String name;

    /**
     * Person's addresses.
     */
    @Singular
    List<Address> addresses;
}
