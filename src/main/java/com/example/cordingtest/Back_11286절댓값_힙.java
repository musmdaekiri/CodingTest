package com.example.cordingtest;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Back_11286절댓값_힙 {

    public static void main(String[] args) {
        Back_11286절댓값_힙 T = new Back_11286절댓값_힙();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1.우선순위 큐를 만든다.
        //2.compartor를 사용해 정렬방법을 정의한다.
        PriorityQueue<Integer> qu = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first==second) {
                return o1 > o2? 1 : -1;
            }
            return first - second;
        });

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x != 0) {
                qu.add(x);
            } else {
                if (qu.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(qu.poll());
                }
            }
        }
    }
}