import java.util.Hashtable;
import java.util.Scanner;
public class test_hash_map {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

        System.out.println("Выберите действие: ");
        System.out.print("0. Выход \n");
        System.out.print("1. Добавление ключ-значения \n");
        System.out.print("2. Получить значение по ключу \n");
        System.out.print("3. Колличество значений в таблице \n");
        System.out.print("4. Удаление по ключу \n");
        System.out.print("5. Очистить всю таблицу \n");
        System.out.print("6. Вывести все пары ключ-значения \n");

        String answer;
        Integer key;
        String value;

        while (true) {

            answer = sc.next();

            switch (answer) {

                case ("0"):
                    System.exit(0);

                case ("1"):
                    System.out.print("Введите ключ: ");
                    key = sc.nextInt();
                    System.out.print("\nВведите значение ключа: ");
                    value = sc.next();
                    hash_map.insert(hash, key,value);
                    break;

                case ("2"):
                    System.out.print("Введите ключ: ");
                    key = sc.nextInt();
                    hash_map.key_to_value(hash, key);
                    break;

                case ("3"):
                    hash_map.values(hash);
                    break;

                case ("4"):
                    System.out.print("Введите ключ: ");
                    key = sc.nextInt();
                    hash_map.delete_by_key(hash, key);
                    break;

                case ("5"):
                    hash_map.delete_all(hash);
                    break;

                case ("6"):
                    hash_map.print(hash);
                    break;

            }

        }

    }

}