package ru.easyjava.java;

import lombok.Builder;
import lombok.Value;

/**
 * Sample address entity.
 */
@Value
@Builder(toBuilder = true)
public class Address {
    /**
     * City name.
     */
    String city;

    /**
     * Street name.
     */
    String street;

    /**
     * Building name.
     */
    String building;
}
