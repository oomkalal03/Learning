public class bonusChallenge {
    public static String getDurationString(long minutes, long secounds){
        if ((minutes<0)||(secounds<0)||(secounds>59)){
            return "Invalid value";
        }

        long hour = minutes/60;
        long remainMinutes = minutes % 60;

        String hourString = hour + "h";
        if (hour<10){
            hourString = "0"+hourString;
        }

        String minuteString = remainMinutes + "min";
        if (minutes<10){
            minuteString = "0"+minuteString;
        }
        String secString = secounds + "sec";
        if (secounds<10){
            secString = "0"+secString;

        }
        return hourString+" "+minuteString+" "+secString;
    }
    public static String getDurationString(long secounds){
        if (secounds<0){
            return "invalid value";
        }

        long minutes = secounds/60;
        long remainSecounds = secounds%60;
        return getDurationString(minutes,remainSecounds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }
}
