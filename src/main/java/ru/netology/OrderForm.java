package ru.netology;

import lombok.Data;

@Data
public class OrderForm {
    private final String city;
    private final String data;
    private final String name;
    private final int phone;
}