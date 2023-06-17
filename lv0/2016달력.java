class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
}

    /*
     String solution(int a, int b) {
        String answer = "";
        long a1 = 0;
        long b1 = 0;
        long day = 0;
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.set(2016, 1, 1);
        c2.set(2016, a, b);
        a1 = c1.getTimeInMillis();
        b1 = c2.getTimeInMillis();
        day = ((b1 - a1) / (60 * 60 * 1000 * 24)) % 7;
        int day1 = (int) day;

        switch (day1) {
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }


        return answer;
    }
} */


