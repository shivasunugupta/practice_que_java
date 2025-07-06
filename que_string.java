import java.util.Scanner;

public class que_string
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        //que 1
//        String name= "shivasunu gupta";
//        name = name.toLowerCase();
//        System.out.println(name);

        //que 2 replace spaces with underscore
//        name= name.replace(" ","_");
//        System.out.println(name);

        //que 3
        //to fill a letter template
        //letter = "dear <|name|>, thanks a lot"
        //replace <|name|> with a string
//        String letter = "Dear <|name|>, thanks a lot";
//        letter=letter.replace("<|name|>","shivasunu");
//        System.out.println(letter);
//
//        //que 4 to detect double and tripple spaces in a string
//        String nnew = "adsfad adfa  adfg  sfdgs";
//        System.out.println(nnew.indexOf("  "));
//        System.out.println(nnew.indexOf("   "));
//
//        //que 5
//        String myletter = "sdfg\n\tdfgjfgj\n\tsfgsgh";
//        System.out.println(myletter);

        // que 6 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

//        int size = sc.nextInt();
//        String array[] = new String[size];
//        int totLength = 0;
//
//        for(int i=0; i<size; i++)
//        {
//            array[i] = sc.next();
//            totLength += array[i].length();
//        }
//        System.out.println(totLength);


        //que 7 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter
        // ‘e’ in the original string with letter ‘i’.
//        System.out.println("enter the string");
//        String str = sc.next();
//        String result = "";
//
//
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == 'e') {
//                result += 'i';
//            } else {
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);

        //que 8 Input an email from the user. You have to create a username from the email by deleting the part that
        // comes after ‘@’. Display that username to the user.
//
//        System.out.println("enter the email address");
//        String email = sc.next();
//        String userName = "";
//
//
//        for(int i=0; i<email.length(); i++) {
//            if(email.charAt(i) == '@') {
//                break;
//            } else {
//                userName += email.charAt(i);
//            }
//        }
//        System.out.println(userName);

        //reverse a string
        StringBuilder a = new StringBuilder( "shivasunu");
        for (int i=0;i<a.length()/2;i++)
        {
            int front =i;
            int back= a.length()-1-i;

            char frontchar=a.charAt(front);
            char backchar=a.charAt(back);

            a.setCharAt(front,backchar);
            a.setCharAt(back,frontchar);
        }
        System.out.println(a);



    }
}
