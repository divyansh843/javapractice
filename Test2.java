public class Test2 {
    public static int Age(int dayOfbirth, int dayOfmonth, int dayOfyear){
        int age = 0;
        int currday = 31;
        int currmonth = 03;
        int curryear = 2021;
        int Ageday = 0;
        int Agemonth = 0;
        int Age = 0;

        if (currday < dayOfbirth) {
            currday += 30;
            currmonth = currmonth - 1;
            Ageday = currday - dayOfbirth;
        }else{
            Ageday = currday - dayOfbirth;
        }
        if (currmonth < dayOfmonth) {
            currmonth += 12;
            curryear = curryear - 1;
            Agemonth = currmonth - dayOfmonth;
        }else{
            Agemonth = currmonth - dayOfmonth;
        }

        Age = curryear - dayOfyear;

       // System.out.println("Current age is : "+ Age + " years " + Agemonth + " month " + Ageday + " days " );

        return Age;
    }
    public static void main(String[] args) {

        System.out.println(Age(03, 10, 2005));
        
    }
}
