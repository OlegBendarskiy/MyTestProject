import java.util.ArrayList;

/**
 * Created by Administrator on 18.06.2018.
 */
public class App {
    public static void main(String[] args) {
        DynamicStringList myDSL = new DynamicStringList(); //Создали объект типа DynamicStringList

        myDSL.add("One");
        myDSL.add("Two");
        myDSL.add("Three");
        myDSL.add("Four");
        myDSL.add("Five");
        System.out.println(myDSL);
        // Добавили 5 элементов массива и вывели их на экран

        System.out.println(myDSL.get()); //Получили последний элемент и вывели его на экран

        System.out.println(myDSL.get(1)); //Получили элемент с индексом 1 и вывели егона экран

        System.out.println(myDSL.remove()); //Удалили последний элемент и вывели его на экран
        System.out.println(myDSL); //Вывели массив на экран

        System.out.println(myDSL.remove(1));//Удалили элемент с индексом 1 и вывели его на экран
        System.out.println(myDSL); //Снова вывели массив на экран

        System.out.println(myDSL.delete()); // Удалили массив
        System.out.println(myDSL); //Вывели массив на экран
    }
}