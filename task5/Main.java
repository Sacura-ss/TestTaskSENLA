package task5;
//динамическое програмирование
/*Есть набор предметов, задаваемый заранее, предметы могут
повторяться. Предмет имеет 2 параметра (обязательных, остальные
добавлять на усмотрение): объем (целое значение) и ценность (целое
значение). Предметы неделимы. Также задаётся сейф с
обязательным параметром его объёма (целое значение).
Нужно написать программу, которая наполняет сейф набором
предметов таким образом, чтобы ценность этого набора была
максимальной.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int n = 3; //число строк = число вещей
        int k = 4; //объем сейфа
        //массив вещей
        Item[] items = {new Item("гитара", 1, 1500),
                new Item("бензопила", 4, 3000),
                new Item("ноутбук", 3, 2000)};
        //массив промежуточных состояний рюкзака
        Safe[][] sf = new Safe[n + 1][k + 1];

        //алгоритм автозаполнения сейфа
        for(int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) { //нулевую строку и столбец заполняем нулями
                    sf[i][j] = new Safe(new Item[]{}, 0);
                } else if (i == 1) {
                    /*первая строка заполняется просто: первый предмет кладём или не кладём в зависимости от объема*/
                    sf[1][j] = items[0].getVolume() <= j ? new Safe(new Item[]{items[0]}, items[0].getValue())
                            : new Safe(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getVolume() > j) //если очередной предмет не влезает в сейф,
                        sf[i][j] = sf[i - 1][j];    //записываем предыдущий максимум
                    else {
                        /*рассчитаем ценность очередного предмета + максимальную ценость для (максимально возможный для сейфа объем − объем предмета)*/
                        int newValue = items[i - 1].getValue() + sf[i - 1][j - items[i - 1].getVolume()].getValue();
                        if (sf[i - 1][j].getValue() > newValue) //если предыдущий максимум больше
                            sf[i][j] = sf[i - 1][j]; //запишем его
                        else {
                            /*иначе фиксируем новый максимум: текущий предмет + стоимость свободного пространства*/
                            sf[i][j] = new Safe(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                                    Arrays.stream(sf[i - 1][j - items[i - 1].getVolume()].getItems())).toArray(Item[]::new), newValue);
                        }
                    }
                }
            }
        }

        //вывод результата-таблицы решения
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                System.out.print(sf[i][j].getDescription() + " ");
            }
            System.out.print("\n");
        }

        //Вывод окончательного результата
        List<Safe> lastColumn = Arrays.stream(sf).map(row -> row[row.length - 1]).collect(Collectors.toList());
        Safe backpackWithMax = lastColumn.stream().max(Comparator.comparing(Safe::getValue)).orElse(new Safe(null, 0));
        System.out.println(backpackWithMax.getDescription());
    }
}
