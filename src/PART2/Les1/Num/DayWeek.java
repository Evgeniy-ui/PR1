
package PART2.Les1.Num;

public enum DayWeek {
    Sunday("выходной", 0, 24, 24),
    Monday("рабочий", 8, 24, 16),
    Tuesday("рабочий",8, 24, 16),
    Wednesday("рабочий", 8, 24, 16),
    Thursday("рабочий", 8, 24, 16),
    Friday("рабочий", 8, 24, 16),
    Saturday("выходной", 0, 24, 24);

    private String day;
    private int WorkingHours = 8;
    private int DayHours = 24;
    private int noWorkingHours = 0;

        DayWeek(){

        }

    DayWeek(String day, int workingHours, int dayHours, int noWorkingHours) {
        this.day = day;
        this.WorkingHours = workingHours;
        this.DayHours = dayHours;
        this.noWorkingHours = noWorkingHours;
    }

    public String getDay() {
        return day;

    }
    public int getWorkingHours(){
        return WorkingHours;
    }
    public int getDayHours(){
        return DayHours;
    }
    public int getNoWorkingHours(){
        return noWorkingHours;
    }

    public void getDayHours(DayWeek dayWeek) {
    }
}
