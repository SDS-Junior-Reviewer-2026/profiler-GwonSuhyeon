package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO : Profiler 실행해보기
        Profiler profiler = new Profiler();

        // 테스트할 sort 이름
        ArrayList<String> sortList = new ArrayList<>(Arrays.asList("bubbleSort", "selectionSort"));

        for (String sortName : sortList) {
            System.out.println(sortName + " 테스트");
            ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8, 1, 7, 5, 1, 4, 3, 2, 2, 1, 1, 9));
            profiler.setData(input);
            profiler.setLib(sortName);
            profiler.runLib();
            profiler.showResult();
        }
    }
}