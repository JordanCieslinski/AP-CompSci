package Assignment1;

public class Date {
    private int day;
    private String month;
    private int year;

    public Date(){
        day = 1;
        month = "June";
        year = 1970;

    }

    public Date(String month1, int day1, int year1){
        day = day1;
        month = month1;
        year = year1;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int a){
        day = a;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String a){
        month = a;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int a){
        year = a;
    }
    public String toString(){
        return month+" "+day+", "+year;
    }
}
