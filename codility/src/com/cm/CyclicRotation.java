package com.cm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 * 답
 * https://app.codility.com/demo/results/trainingC6ACKE-K7K/
 */
public class CyclicRotation {


    public CyclicRotation(){
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        /*int[] A = {};
        int K = 1;*/

        /*int[] A = {3, 8, 9, 7, 6};
        int K = -10;*/

        solution(A, K);
    }

    public int[] solution(int[] A, int K){
        if(! (0<=K) || ! (100>=K) || A.length==0){
            return A;
        }

        int[] result = new int[A.length];

        Deque <Integer> que = new ArrayDeque<Integer>();

        for(Integer i : A){
            que.add(i);
        }

        for(int i=0 ; i<K ; i++){
            int firstValue = que.pollLast();
            que.addFirst(firstValue);
        }

        for(int j=0; j<A.length; j++){
            result[j] = que.poll();
        }

        return result;
    }
}
