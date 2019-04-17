package timeConversion;

public class test {


    public static void main(String[] args) {


        System.out.println(timeConversion("05:00 PM"));

    }



    static String timeConversion(String s) {
        String ret = s.substring(0, s.length()-2);
        int hoursInt = Integer.parseInt(s.substring(0,2));
        if (s.endsWith("PM") && hoursInt<12){
            String hours = Integer.toString(hoursInt+12);
            ret = hours+ret.substring(2);
        }
        else if (s.endsWith("AM") && hoursInt==12){
            ret = "00"+ret.substring(2);
        }
        return ret;
    }






}
