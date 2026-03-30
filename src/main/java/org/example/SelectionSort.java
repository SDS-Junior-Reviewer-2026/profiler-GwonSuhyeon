package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements Sort {
    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            int min = arr.get(i);
            int minIdx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (min > arr.get(j)) { // 기록만
                    min = arr.get(j);
                    minIdx = j;
                }
            }

            // 가장 작은 것만 교체
            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                changeCnt++;
            }

        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }
}