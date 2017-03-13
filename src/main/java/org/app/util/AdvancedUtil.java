package org.app.util;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedUtil {
    public static <T, U> List<T> sortList(List<T> list, Comparator<T> comparator){
        return list.stream().sorted(comparator).collect(Collectors.toList());
    }
}
