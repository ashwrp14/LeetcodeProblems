public class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int minDist = n; // maximum possible distance is n
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int dist = Math.abs(i - j);
                    if (dist < minDist) {
                        minDist = dist;
                    }
                }
            }
            answer[i] = minDist;
        }

        return answer;
    }
}
//ANOTHERMETHOD:O(n)
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] output = new int[n];
        int cPosition = -n;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                cPosition = i;
            }
            output[i] = i-cPosition;
        }

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == c){
                cPosition = i;
            }
            output[i] = Math.min(output[i], Math.abs(i - cPosition));
        }
        return output;
    }
}
