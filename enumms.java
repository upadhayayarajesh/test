package OOP;

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

class Test{
    Day day;

    public Test(Day day) {
        this.day = day;
    }
    public void dayIslike(){
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("weekends are best");
                break;
            default:
                System.out.println("Midweek days are so-so.");
        }
    }

    public static void main(String[] args) {
        String str= "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIslike();
    }
}