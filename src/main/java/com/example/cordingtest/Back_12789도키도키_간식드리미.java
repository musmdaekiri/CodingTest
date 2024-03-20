package com.example.cordingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back_12789도키도키_간식드리미 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++) {
            queue.add(Integer.parseInt(token.nextToken()));
        }

        int start = 1;
        while (!queue.isEmpty()) {
            if(queue.peek()==start) {
                queue.poll();
                start++;

            }else if(!stack.isEmpty() && stack.peek() == start){
                stack.pop();
                start++;
            }

            else {
                stack.push(queue.poll());
            }
        }


        String answer = "Nice";
        while (!stack.isEmpty()) {
            if(stack.pop()==start) {
                start++;
            } else {
                answer = "Sad";
                break;
            }
        }
        System.out.println(answer);
    }
}
