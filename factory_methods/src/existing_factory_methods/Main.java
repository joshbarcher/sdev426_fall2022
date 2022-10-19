package existing_factory_methods;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        //LocalDate holiday = new LocalDate(12, 25, 2022);
        LocalDate holiday = LocalDate.of(2022, 12, 25);
        LocalDate now = LocalDate.now();
        LocalDate parsed = LocalDate.parse("2022/12/25");

        int first = Stream.of(1, 2, 3, 4).findFirst().get();

        String numAsString = String.valueOf(10);

        List<String> stringsList = List.of("Hello", "World", "!");
        Map<String, Integer> booksToPages = Map.of(
            "Fellowship of the Ring", 600,
            "Two Towers", 500,
            "Return of the King", 700
        );
    }
}
