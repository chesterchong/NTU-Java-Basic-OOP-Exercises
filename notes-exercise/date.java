public class date {
    private int day, month, year;

    public date(int year, int month, int day){
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    //setters

    public void setYear(int year){
        if ( year > 1900 && year <2100){
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid Year !!!");
        }
    }
    
    public void setMonth(int month){
        if (month > 0 && month <13){
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid Month!!");
        }
    }

    public void setDay (int day){
        if (day > 0 && day < 31){
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid Day !!");
        }
    }

    public void setDate (int year, int month, int day){
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    // getters

    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public String toString(){
        return String.format("%02d/%02d/%02d", month,day,year);
    }

    // test driver
    public static void main(String[] args) {
        date o1;
        // test 1
        try {
            o1 = new date(2017, 50, 12);
            System.out.println("Date format is correct");
        } catch (IllegalArgumentException ex){
            System.out.println("Date format is incorrect, session terminated");
        }
        // test 1.1
        try {
            o1 = new date(2017, 11, 29);
            System.out.println("initialized successfully");
        } catch (IllegalArgumentException ex){
            System.out.println("problem occured");
        }
        o1 = new date(2018, 11, 13);
        
        System.out.println(o1.getYear()); // test 2
        System.out.println(o1.getMonth()); //test 3
        System.out.println(o1.getDay()); // test 4
        o1.setYear(2011); // test5
        o1.setMonth(6); // test 6
        o1.setDay(12); // test 7
        System.out.println(o1); // test 8
        o1.setDate(2022, 2, 22);
        System.out.println(o1); // test 9

    }
}
