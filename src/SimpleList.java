/**
 * Created by Administrator on 18.06.2018.
 */
public interface SimpleList {
    public void add(String s);//добавить строку в массив
    public String get();//получить последний элемент из массива
    public String get(int id);//получить элемент по его индексу
    public String remove();//удалить последний элемент
    public String remove(int id);//удалить элемент по индексу
    public boolean delete();//удалить все элементы массива.
}
