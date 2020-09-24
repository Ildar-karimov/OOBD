package OOBD.lab2;

import OOBD.lab2.hw.Person;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Person> persons = LoadAvito.loadPersonList();

            persons.forEach(System.out::println);

            Person prs = PersonService.findPersonByName(persons, "Иван");

            if (prs != null) {
                prs.setPhoneNumber("+71111111111");
                prs.setEmail("ivan@mail.ru");
            }

            SaveAvito.savePersonList(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
