using System;

public class Solution {
    public int[] solution(int start, int end) {
        
        int size = start - end + 1;
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = start--;
        }
        
        return answer;
    }
}