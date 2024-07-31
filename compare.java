/**
 * compare
 */
public class compare {

    public static void main(String[] args) {
        
        String a = "Amish";

        String b = "Amish";

        //1 a > b : +ve value
        //2 a = b : 0
        //3 a < b : -ve value

        // eg: hello < wello OR hello > cello o+OR aahello > aabello OR ...etc.

        if( a.compareTo(b) == 0){
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
    }
}