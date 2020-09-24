package OOBD.lab2;

import OOBD.lab2.hw.Avito;
import OOBD.lab2.hw.Person;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadAvito {

    public static Avito load() throws IOException {
        Avito avito = null;
        String avitoStr = "";
        File file = new File("avito.json");

        if (file.exists()) {
            avitoStr = new String(Files.readAllBytes(file.toPath()));
        }

        avito = new Gson().fromJson(avitoStr, Avito.class);

        return avito;
    }

    /**
     * Пример чтения из файла массива JSON объектов
     */
    public static List<Person> loadPersonList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("persons.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }

        Gson gson = new Gson();

        Person[] plst = gson.fromJson(pStr, Person[].class);

        return Arrays.asList(plst);
    }
}
