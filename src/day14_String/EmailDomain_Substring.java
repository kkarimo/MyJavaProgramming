package day14_String;


public class EmailDomain_Substring {

    public static void main(String[] args) {



        System.out.println("Enter email address:");

        String email = "kkarimov@gmail.com";

        String domain = email.substring( email.indexOf("@")+1  , email.lastIndexOf(".")  );

        System.out.println("domain = " + domain);

        System.out.println("------------------------------");

        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0,11);

        System.out.println(s1);

    }

}

/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */