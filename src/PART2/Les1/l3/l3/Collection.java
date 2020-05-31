package PART2.Les1.l3.l3;

                //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
                // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
                // Посчитать, сколько раз встречается каждое слово.

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        Collections.addAll(List, "чашка", "блюдце", "ложка", "чашка", "тарелка", "кружка", "вилка"
                , "ложка", "тарелка", "кружка", "кастрюля", "чашка", "кастрюля", "чайник",
                "чашка", "тарелка");
        System.out.println(List);
        System.out.println(List.size() + " -количество элементов");
        System.out.println();
//        for (String l : List
//        ) {
//            System.out.println(l);
//        }
        List<String> strings = Arrays.asList("чашка", "блюдце", "ложка", "чашка", "тарелка", "кружка", "вилка"
                , "ложка", "тарелка", "кружка", "кастрюля", "чашка", "кастрюля", "чайник",
                "чашка", "тарелка");
        strings.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        String el1 = String.valueOf(Collections.frequency(List, "чашка"));
        String el2 = String.valueOf(Collections.frequency(List, "блюдце"));
        String el3 = String.valueOf(Collections.frequency(List, "ложка"));
        String el4 = String.valueOf(Collections.frequency(List, "тарелка"));
        String el5 = String.valueOf(Collections.frequency(List, "кружка"));
        String el6 = String.valueOf(Collections.frequency(List, "вилка"));
        String el7 = String.valueOf(Collections.frequency(List, "кастрюля"));
        String el8 = String.valueOf(Collections.frequency(List, "чайник"));
        System.out.println(el1 + " раза встречается слово - чашка" + "\n" + el2 + " раз встречается слово - блюдце"
                + "\n" + el3 + " раза встречается слово - ложка" + "\n" + el4 + " раза встречается слово - тарелка"
                + "\n" + el5 + " раза встречается слово - кружка" + "\n" + el6 + " раз встречается слово - вилка" +
                "\n" + el7 + " раза встречается слово - кастрюля" + "\n" + el8 + " раз встречается слово - чайник");
    }
}
