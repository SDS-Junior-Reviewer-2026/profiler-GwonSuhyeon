package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Profiler {
    private ArrayList<Integer> data;
    private Sort sort;

    /**
     * Sort Library 성능 평가를 위한 Input Data를 세팅
     * @param _data ArrayList<Interger> 타입의 input data
     */
    public void setData(ArrayList<Integer> _data){
        data = _data;
    }

    /**
     * Sort Library를 세팅
     * @param _name sort library 이름
     */
    public void setLib(String _name){
        if (_name == "bubbleSort") sort = new BubbleSort();
        else if (_name == "selectionSort") sort = new SelectionSort();
        else sort = null;
    }

    /**
     * Library를 동작시킴
     */
    public void runLib(){
        if (sort != null) sort.sort(data);
        else System.out.println("해당 Sort 함수는 없어요.");
    }

    /**
     * Sort 결과와, Swap 횟수를 출력
     */
    public void showResult(){
        if (sort == null) return;
        System.out.println("정렬결과:" + Arrays.toString(data.toArray()));
        System.out.println("swap횟수:" + sort.getChangeCnt());
    }
}