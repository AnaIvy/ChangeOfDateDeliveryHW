package ru.netology;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;
import ru.netology.OrderForm;

@UtilityClass
public class DataGenerator {
    @UtilityClass

    public static class Order {
        public OrderForm generateInfo (String locale) {
            Faker faker = new Faker (new locale();
            return new OrderForm(faker.address().city(), faker.date(), faker.name(),faker.phoneNumber());
        }

        private static void locale() {

        }
    }
}
