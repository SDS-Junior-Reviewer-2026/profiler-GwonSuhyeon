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
     * @param _lib Sort 인터페이스의 Library
     */
    public void setLib(Sort _lib){
        sort = _lib;
    }

    /**
     * Library를 동작시킴
     */
    public void runLib(){
        sort.sort(data);
    }

    /**
     * Sort 결과와, Swap 횟수를 출력
     */
    public void showResult(){
        System.out.println("정렬결과:" + Arrays.toString(data.toArray()));
        System.out.println("swap횟수:" + sort.getChangeCnt());
    }
}