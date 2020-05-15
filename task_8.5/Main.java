/* 
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bReader = new BufferedReader(new FileReader("c:/java/1.txt"));
        String s;
        while((s=bReader.readLine())!=null){
            System.out.println(s);
        }*/
        BufferedReader readerFromConcole = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла");
        String fileName=readerFromConcole.readLine();
        String pathToFile="c:/java/" + fileName;
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(pathToFile));

        String result= "";
        String line;
        System.out.println("Введите строки. Для выхода введите exit");
        do{
            line=readerFromConcole.readLine();
            result+=line;
            result+="\n";
        } while(!line.equals("exit"));
        readerFromConcole.close();

        bWriter.write(result);
        bWriter.close();
        System.out.println("Данные записаны в файл " + pathToFile);

    }
}
