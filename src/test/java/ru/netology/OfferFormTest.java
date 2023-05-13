package ru.netology;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class OfferFormTest {
    public static Faker faker;

    @BeforeAll
    static void setFaker() {
        faker = new Faker(new Locale("ru"));
    }
@Test
    void shouldChangeOfDeliveryIfReSubmitForm(){
        OrderForm info = DataGenerator.Order.generateInfo("ru");
        printTestData(info);
    //@Test
    //void shouldChangeOfDeliveryIfReSubmitForm() {
        //String city = faker.address().city();
        //int date = faker.date().future(31, 3);
        //String name = faker.name().fullName();
        //String phone = faker.phoneNumber().phoneNumber();
        //print (city, date, name, phone);
    }

    private void printTestData(OrderForm info) {
    }
}
