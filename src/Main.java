import java.util.Random;

public class Main {
    public static void main(String[] args) {


        //Создание двух коробок
        MagicBox<Integer> boxInt = new MagicBox<Integer>(7);
        MagicBox<String> boxString = new MagicBox<>(5);
        Random random = new Random();

        //Добавление в коробку с числами (не полностью)
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));

        //Извлечение из неполной коробки чисел
        //System.out.println("Из коробки извлечено: " + boxInt.pick());

        //Добавление в коробку с числами (полностью)
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));
        boxInt.add(random.nextInt(1000));
        System.out.println();

        //Извлечение из полной коробки чисел
        System.out.println("Из коробки извлечено: " + boxInt.pick());

        System.out.println();

        //Добавление в коробку со строками (не полностью)
        boxString.add("Вместе");
        boxString.add("Весело");
        boxString.add("Шагать");

        //Извлечение из неполной коробки строк
        //System.out.println("Из коробки извлечено: " + boxString.pick());

        //Добавление в коробку со строками (полностью)
        boxString.add("По");
        boxString.add("Просторам");
        boxString.add("...");
        System.out.println();

        //Извлечение из полной коробки строк
        System.out.println("Из коробки извлечено: " + boxString.pick());
    }
}
