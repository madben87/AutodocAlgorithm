package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayHelper {

    private static int count = 0;

    public static int countSameElements(Object[] arr1, Object[] arr2) {

        ArrayList<Object> first = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Object> second = new ArrayList<>(Arrays.asList(arr2));
        ArrayList<Object> resList = new ArrayList<>();

        Iterator<Object> it = first.iterator();

        while (it.hasNext()) {
            count++;
            if (removeIfContains(second, it.next())) {
                resList.add(it);
                it.remove();
            }
        }

        return resList.size();
    }

    private static boolean removeIfContains(List<Object> list, Object o) {
        if (o == null) {
            for (int i = 0; i < list.size(); i++)
                if (list.get(i) == null) {
                    list.remove(i);
                    count++;
                    return true;
                }
        } else {
            for (int i = 0; i < list.size(); i++)
                if (o.equals(list.get(i))) {
                    list.remove(i);
                    count++;
                    return true;
                }
        }
        return false;
    }

    public static int getIterationsCount() {
        return count;
    }
}
