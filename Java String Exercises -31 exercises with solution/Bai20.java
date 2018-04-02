package javaStringExercises;

public class Bai20 {
	public static void main(String[] args)
    {
        String str1 = "CNTT & TT";
        String str2 = new StringBuffer("CNTT").append(" &TT").toString();
        String str3 = str2.intern();


        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
