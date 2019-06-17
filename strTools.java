public class StrTools{
    public static String changeFirstChar(String str){
        //String tmp = str.substring(1);
        //String f = str.substring(0,1);
        //return f.toUpperCase() + tmp;
        return str.substring(0,1).toUpperCase() +
               str.substring(1);
    }
    public static String addPeriod(String str){
        return str + ".";
    }

    //repalce a target word with a given word
    public static String replace(String str, String target, String repl){
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0,firstIndex);
        String secondPart =str.substring(secondIndex);
        return firstPart + repl + secondPart;
    }

    //print single character of a string
    //"abcd" return "a,b,c,d."
    public static String printSingleChar(String str){
        int index = 0;
        String tmp = "";
        while(index < str.length()-1){
            tmp += str.substring(0,1);
            tmp += ",";
            tmp += "";
        }
        return tmp + str.substring(str.length()-1) + ".";
    }
    public static void main(String []args){
        String str = "united republic of Mars";
        String tmp = replace(str,"republic","association");
        System.out.println(tmp);
    }
    public static void mian(String[] args){
        String str = "united republic of mars";//change the first character 'u'
        String tmp = changeFirstChar(str);//tmp "United"
        System.out.println(tmp);
    }
    public static String reverse(String str){
        String tmp = "";
            for(int i = str.length()-1; i >= 0; i--){
                tmp += str.substring(i, i+1);
            }
            return tmp;
        }
    public static String parliword(String str){
        return str + reverse(str);
    }
    public static String parlihalf(String str){
        String tmp = "";
        if(str.length() % 2 ==0){
            tmp = str.substring(0, str.length()/2);
        }
        else{
            tmp = str.substring(0,str.length()/2+1);
        }
        return tmp + reverse(str);
    }
    public static String parlicompare(String str){
        String tmp = "";
        int j = 0;  
        for (int i = 0; i < str.length() / 2; i++) {  
        if ((str.substring(i, i + 1)).equals(str.substring(str.length() - 1- i, str.length() - i))) {  
                j++;  
            }  
        }  
        if (j == str.length() / 2){
            System.out.println(tmp + "is a parliword");  
        }
        else{  
            System.out.println(tmp + "is not a parliword");  
        }  
    }  
}
