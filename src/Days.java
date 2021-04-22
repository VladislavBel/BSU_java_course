public enum Days {
    MONDAY(5), TUESDAY(4), WEDNESDAY(2), THURSDAY(1), FRIDAY(6), SATURDAY(0), SUNDAY(0);

    Days(int numOfLess){
        num = numOfLess;
    }

    private final int num;

    public int numOfLessons(){
        return num;
    }
}
