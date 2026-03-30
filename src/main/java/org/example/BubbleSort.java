package org.example;

import java.util.ArrayList;

public class BubbleSort implements Sort{
    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    changeCnt++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }
}
