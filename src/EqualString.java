public class EqualString {
    public static boolean compare(String x, String y){
        if(x==null || y==null){
            return false;
        }
        if(x.length()!=y.length())
            return false;

        for (int i = 0; i <x.length() ; i++) {
            if(x.charAt(i)!=y.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String x = "tutorial";
        String y = "tutorial";
        if(x==y){
            System.out.println("The Strings are true");
}
else{
            System.out.println("The Strings are false");
    }
}
}
