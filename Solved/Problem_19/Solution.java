package Solved.Problem_19;
public class Solution {
    public static void main(String[] args){
        int answer = 0;
        int dayOfWeek = 0; // 0 = Monday, 6 = Sunday
        int dayOfMonth = 1;
        int month = 1;
        int year = 1901;
        while(year < 2001){
            if(dayOfMonth == 1 && dayOfWeek == 0) answer++;
            dayOfMonth++;
            if(++dayOfWeek > 6) dayOfWeek -= 7;
            int daysInMonth = 0;
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
            }
            if(dayOfMonth > daysInMonth){
                dayOfMonth -= daysInMonth;
                if(month++ == 12){
                    month -= 12;
                    year++;
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}