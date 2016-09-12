/**
 * Created by Matt on 9/12/2016.
 */
public class Main {
    public static void main (String []args){
        String s1 = "Allan Alda";
        String s2 ="John Wayne";
        String s3 = "Gregory Peck";
            //Allan
        String newName = s1.substring(s1.length()-8, s1.length()-3);
        System.out.println(newName );

            //John
        String nextName = s2.substring(s2.length()-8, s2.length()-3);
        System.out.println(nextName);

            //Gregory
        String finalName = s3.substring(s3.length()-10, s3.length()-3);
        System.out.println(finalName);
    }
}
