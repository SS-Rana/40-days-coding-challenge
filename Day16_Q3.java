public class Day16_Q3 {
    public static String copyString(String source){
       String target="";
        for(int i=0; i<source.length(); i++){
            char ch = source.charAt(i);
            target+=ch;
        }
        return target;
    }
    public static void main(String[] args) {
        String source = "The source is coppied to the target";
        String target="Source not copied";
        target = copyString(source);
        System.err.println(target);
    }
}
