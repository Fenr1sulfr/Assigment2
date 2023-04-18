public class date implements Comparable<date> {
    private int day;
    private int month;
    private int year;

    public date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public int compareTo(date o) {
        if(this.year>o.year){
            return 1;
        }
        else if(this.month>o.month){
            return 1;
        }
        else if(this.day>o.day){
            return 1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return day+"."+month+"."+year;
    }
}
