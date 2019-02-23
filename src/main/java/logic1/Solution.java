package logic1;

public class Solution {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars > 39 && cigars < 61) {
            return true;
        }
        if (cigars > 60) {
            return isWeekend;
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if (you > 7 && date > 2 || date > 7 && you > 2) {
            return 2;
        }
        if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        }
        return temp >= 60 && temp <= 90;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed < 61) {
            return 0;
        }
        if (speed > 80) {
            return 2;
        }
        return 1;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return 20;
        }
        return a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        boolean workday = false;
        if (day > 0 && day < 6) {
            workday = true;
        }
        if (workday && vacation) {
            return "10:00";
        }
        if (workday && !vacation) {
            return "7:00";
        }
        if (!workday && vacation) {
            return "off";
        }
        return "10:00";
    }

    public boolean love6(int a, int b) {
        return a == 6 ||
                b == 6 ||
                a + b == 6 ||
                Math.abs(a - b) == 6;
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return n > 0 && n < 11;
        }
        return !(n > 1 && n < 10);
    }

    public boolean more20(int n) {
        return n > 20 && (n % 20 == 1 || n % 20 == 2);
    }

    public boolean old35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }

    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 > 7;
    }

    public int teenSum(int a, int b) {
        if ((a > 12 && a < 20) || (b > 12 & b < 20)) {
            return 19;
        }
        return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        if ((isMorning && isMom) || !isMorning)
            return true;
        else return false;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea + tea <= candy || candy + candy <= tea) {
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        String result = "";
        if (str.charAt(0) == 'f'){
            result += "Fizz";
        }
        if (str.charAt(str.length()-1) == 'b'){
            result += "Buzz";
        }
        if (result.equals("")){
            result = str;
        }
        return result;
    }

    public String fizzString2(int n) {
       if (n % 3 !=0 && n % 5 != 0){
           return n +"!";
       }
       String result = "";
       if (n % 3 == 0){
           result += "Fizz";
       }
       if (n % 5  == 0){
           result += "Buzz";
       }
       return result + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a == b + c || b == a + c || c == a + b;
    }
}
