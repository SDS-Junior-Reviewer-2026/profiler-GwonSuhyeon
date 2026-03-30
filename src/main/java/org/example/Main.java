package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO : Profiler 실행해보기
        Profiler profiler = new Profiler();

        System.out.println("bubbleSort 테스트");
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8, 1, 7, 5, 1, 4, 3, 2, 2, 1, 1, 9));
        profiler.setData(input);
        profiler.setLib(new BubbleSort());
        profiler.runLib();
        profiler.showResult();

        System.out.println("-----------------------------");
        System.out.println("selectionSort 테스트");
        ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(8, 1, 7, 5, 1, 4, 3, 2, 2, 1, 1, 9));
        profiler.setData(input2);
        profiler.setLib(new SelectionSort());
        profiler.runLib();
        profiler.showResult();
        
    }
}