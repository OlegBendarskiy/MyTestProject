/**
 * Created by Administrator on 15.06.2018.
 */

public class DynamicStringList implements SimpleList {
    private static final int DEFAULT_CAPACITY = 10;// Размер массива, который присваиваеться по умолчанию.
    private String[] arrayString;// Создаем переменную, которая будет хранить ссылку на массив елементов типа String.
    private int size;// Указывает размер массива (ту его часть, которая является заполенной елементами).

    /*Пустой конструктор, который обращаеться к конструктору с аргументом и в качестве аргумента передает значение
    емкости по умолчанию (DEFAULT_CAPACITY).*/
    public DynamicStringList() {
        this(DEFAULT_CAPACITY);
    }

    //Конструктор с числовым аргументом, определяющим начальный размер массива.
    public DynamicStringList(int capacity) {
        arrayString = new String[capacity];
    }

    //Метод, который добавляет новый елемент в массив и, в случае когда не хватает места, расширяет его.
    public void add(String s) {
        if (size == arrayString.length){
            String[] newArrayString = new String[(arrayString.length * 3) / 2 + 1];
            System.arraycopy(arrayString, 0, newArrayString, 0, size - 1);
            arrayString = newArrayString;
        }
        arrayString[size] = s;
        size++;
    }

    //Метод, который выводит последний элемент массива
    public String get() {
        if (size == 0)
            throw new RuntimeException("The array doesn't have elements");
        return "The last element with index "+(size-1)+": "+ arrayString[size - 1];
    }

    //Метод, который выводит элемент по его индексу.
    public String get(int id) {
        if (id < 0 || id >= this.size)
            throw new IllegalArgumentException("The array has elements with indexes from "+0+" to "+(size-1));
        return "The element with index "+id+": "+arrayString[id];
    }

    //Метод, который удаляет последний элемент массива и возвращает значение этого элемента.
    public String remove() {
        if (size == 0)
            throw new RuntimeException("The array doesn't have elements");
        --size;
        String s = arrayString[size];
        arrayString[size] = null;
        return "The last element with index "+size+" was removed: "+s;
    }

    //Метод, который удаляет элемент по его индексу и возвращает значение этого элемента.
    public String remove(int id) {
        if (id < 0 || id >size)
            throw new IllegalArgumentException("The array has elements with indexes from "+0+" to "+(size-1));
        String s = arrayString[id];
        --size;
        System.arraycopy(arrayString, id + 1, arrayString, id, size - id);
        arrayString[size] = null;
        return "The element with index "+id+" was removed: "+s;
    }

    /*Метод, который удаляет все элементы массива и возвращает true. В случае? если массив не имеет элементов -
    возвращаемое значение false*/
    public boolean delete() {
        if (size == 0)
            return false;

        size = 0;
        arrayString = new String[DEFAULT_CAPACITY];
        return true;
    }

    //Переопределенный метод toString для вывода всех заполненных элементов массива.
    @Override
    public String toString() {
        if (size == 0){
            return "The array doesn't have elements";
        }
        String s = "[";
        for (int i = 0; i < size-1; i++) {
            s += arrayString[i] + ", ";
        }
        s += arrayString[size-1]+ "]";
        return s;
    }
    // Тексты к возвращаемым значениям добавил только для нагляднности.
    // Я понимаю, что для работы с объектом класса они будут лишними.
}