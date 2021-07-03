package java_discussion_19;


public class Test {

    public static String notString(String str) { //"not" -> "not" , "" -> "not"

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static String notString__(String str){
        if(str.contains("not") && str.indexOf("not") == 0){
            return str;
        }

        return "not " + str;
    }

    public static String __notString(String str){

        int s = 0;
        int e = str.indexOf("not");

        if(str.contains("not")) {

            String startS = str.substring(s, e);

            if (startS.trim().equals("")) {
                return str;
            }
        }

        return "not " + str;
    }

    public static void main(String[] args) {

//        String s = "     not cat";
//        String sub =  "         "; // trim -> sub = "";
//
//        System.out.println(notString(" not"));
//
//        System.out.println(notString__("  not"));

//        System.out.println(notString("not cat"));
//        System.out.println(notString__("not cat"));
//
//        System.out.println(notString("cat"));
//        System.out.println(notString__("cat"));

//        System.out.println(__notString("not"));

//        System.out.println(__notString("   not"));
//        System.out.println(__notString("not"));
        System.out.println(__notString("cat"));
//        System.out.println(__notString("not cat"));

//        String s = "cat";
//        System.out.println(s.indexOf("not"));



    }


}
