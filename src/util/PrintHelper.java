package util;

import java.util.Collection;
import java.util.List;

public class PrintHelper {



    // общий алгоритм разделения страниц при печати 2 страцы на 1 листе:
    //Пример для книги с разбивкой по 8 листов в тетради -   которая умещает 16 страниц текста
    // Четные страницы = 16, 1, 14, 3 ,
    // Закономерность - сначала стоит последнняя страница , за ней первая -> последняя -2 -> первая +2...
    // break == ?;
    // Не четные страницы = 2, 15, 4, 13 ...
    //Закономерность-сначала стоит первая страница +1 , за ней последняя-1 -> первая страница +3 , за ней последняя-3...
    // break == ?;
    //так же необходимо учесть если количество страниц не кратно 16 ->
    // нужно переделать алгоритм для уменьшения количества страниц на кратное 8 или 4

    //First step:
    //Рассчитать нечетные страницы учитывая количество листов в одной тетради и разбивку целой книги на тетради






}
