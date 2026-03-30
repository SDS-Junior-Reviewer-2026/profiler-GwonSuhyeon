package org.example;

import java.util.ArrayList;

public interface Sort {
    void sort(ArrayList<Integer> arr); // sort 진행
    int getChangeCnt(); // swap 횟수
}
