/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        //каменты пишу себе, чтобы потом использовать готовое, а не изобретать велосипед каждый раз

        // создаем коллекцию, в которую позже загоним строки из файла
        ArrayList<Integer> linesFromFile = new ArrayList<Integer>();

        //Считываем с клавиатуры имя файла
        BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла");
        String fileName=readerFromConsole.readLine();
        String pathToFile="c:/java/" + fileName;

        //создаем ридер из файла и читаем числа
        BufferedReader readerFromFile = new BufferedReader(new FileReader(pathToFile));
        String line;
        while((line=readerFromFile.readLine())!=null){
            linesFromFile.add(Integer.parseInt(line));
        }

        //Сортируем коллекцию по возрастанию
        Collections.sort(linesFromFile);

        // Проходим по коллекции. Если число четное - выводим на экран
        for(int num : linesFromFile){
            if(num%2==0) System.out.println(num);
        }

        //System.out.println(linesFromFile);

        //закрываем ридеры
        readerFromFile.close();
        readerFromConsole.close();
    }
}
