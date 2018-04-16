package io.zipcoder;

public class Problem3 {

    public static String methodMan(Integer n){
        String answer = "";
        for (int i = 1; i <= n; i++){
            if (i%15 == 0){
                answer += ", WuTang";
            }
            else if (i%5 == 0){
                answer += ", Tang";
            }
            else if (i%3 == 0){
                answer += ", Wu";
            }
            else if (i ==1){
                answer += i;
            }
            else answer += ", "+i;
        }
        return answer;
    }

}
