import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Необходимо реализовать следующий метод:
//        1. На вход получаем список названий книг
//        2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
//        3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
//        4 Количество полок константное - 5 штук
//        5. Вернуть книги распределенные по полкам
public class Main {
    private static List<ArrayList<String>> getShelvesOfBook(List<String> books) {
        books = books.stream().sorted().collect(Collectors.toList());

        List<ArrayList<String>> shelves = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ArrayList<String> shelf = new ArrayList<>();
            shelves.add(shelf);

        }
        int ind = 0;

        int perShelf = books.size() / shelves.size();
        int remainder = books.size() % shelves.size();

        for (List<String> shelve : shelves) {
            for (int i = 0; i < perShelf; i++)
                shelve.add(books.get(ind++));
                if (remainder-- > 0)
                    shelve.add(books.get(ind++));
            }
            return shelves;

        }
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");
        books.add("book5");
        books.add("book6");
        books.add("book7");
        books.add("book8");
        books.add("book9");
        books.add("book10");
        books.add("book11");
        books.add("book12");

        List<ArrayList<String>> ret = getShelvesOfBook(books);
        ret.stream().forEach(System.out::println);

    }
}