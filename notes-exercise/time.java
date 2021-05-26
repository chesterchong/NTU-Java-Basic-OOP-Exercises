import java.util.Scanner;

public class time {
    private int second, minute, hour; // attribute

    public time(){
        // default constructor
        second = 0;
        minute = 0;
        hour = 0;
    }

    public time(int second, int minute, int hour){
        // overloaded constructor
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    } 

    // setters
    public void setHour(int hour){
        if (hour >= 0 && hour <24){
            this.hour = hour;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <60){
            this.minute = minute;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public void setSecond(int second){
        if (second >= 0 && second <60){
            this.second = second;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public void setTime(int second,int minute,int hour){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    // getters
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

    // methods
    public time nextSecond(){
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60){
                minute = 0;
                hour++;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    // test driver
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        time t1 = new time();
        
        // break instead of toggling new variable
        // while is better than do while
        // try can replace if statement

        // test 1,2
        while (true){
            System.out.println("Enter your hour:");
            int h1 = input.nextInt();
            System.out.println("Enter your minute:");
            int m1 = input.nextInt();
            System.out.println("Enter your second:");
            int s1 = input.nextInt();
            try {
                t1.setTime(s1, m1, h1);
                input.close();
                break;
            } catch (IllegalArgumentException ex){
                System.out.println("Invalid input");
            }
        }
        
        System.out.println("Your time after validation is: "+t1);
        System.out.println(t1.nextSecond().nextSecond().nextSecond());

        // test 3,4,5
        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());

        //test 6,7,8,9
        t1.setHour(23);
        t1.setMinute(23);
        t1.setSecond(32);
        System.out.println(t1);
        
        //test 10,11
        t1.setTime(21, 50, 03);
        System.out.println(t1.nextSecond());
    }
}
