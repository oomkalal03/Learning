public class secoundsAndMinutesChallenge {
    public static String getDurationString(long minutes, long secounds){
        if ((minutes<0) ||(secounds<0)||(secounds>=59)){
            return "invalid value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes%60;
        return hours + " h "+remainingMinutes+" m "+ secounds+" s.";
    }
    public static String getDurationString(long secounds){
        if(secounds<0){
            return "invalid value";
        }
        long minutes = secounds/60;
        long remainingSecounds = secounds%60;
        return getDurationString(minutes,remainingSecounds);
    }


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(120L));
    }

}
