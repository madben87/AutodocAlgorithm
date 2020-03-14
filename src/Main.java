import static utils.ArrayHelper.*;

/*
Есть 2 массива с данными. Необходимо определить количество пересекающихся элементов, используя наименьшее количество итераций (loop).
Создать метод который получает 2 массива и возвращает количество пересекающиеся элементов.
*/

public class Main {
    public static void main(String[] args) {

        Integer[] arr1 = new Integer[] {1, 2, 3, 4, 9};
        Integer[] arr2 = new Integer[] {1, 2, 2, 5, 9, 8, 6};

        //String[] arr1 = new String[] {"Один", "Два", "Два", "Три", "Четыре"};
        //String[] arr2 = new String[] {"Один", "Два", "Шесть", "Шесть", "Шесть", "Шесть"};

        System.out.println("count of same elements - " + countSameElements(arr1, arr2));
        System.out.println("count of iterations - " + getIterationsCount());
    }
}
