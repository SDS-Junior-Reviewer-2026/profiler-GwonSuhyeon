package org.example;

import java.util.ArrayList;

public class BubbleSort implements Sort {
    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) { // n-1번 반복
            for (int j = 0; j < n - 1 - i; j++) { // 이미 정렬된 끝부분 제외
                if (arr.get(j) > arr.get(j + 1)) {  // 인접 요소 비교
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    changeCnt++;
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }
}