
public class HscResultPerception {
    
    
    static void sscHscPerception(String hscSample){
     String[] output = hscSample.split(",");
        //System.out.println(output.length);
        for (String s : output) {
            String[] innerOut = s.split(":");
            for(String i : innerOut){
             //System.out.println(s+" "+i + " " + i.length()); 
             if(i.length()== 3){System.out.print("Subject Code :"+i+" ");}else{System.out.println("GPA :"+i);}
            }
        }
    
    }

    public static void main(String[] args) {
        String sscSample = "101:A+,107:A+,109:A+,145:A,111:A+,136:A+,137:A+,138:A+,126:A+";
        String hscSample = "101:A,107:A,275:A+,174:A-,176:A+,178:A,265:A+";
        sscHscPerception(hscSample);
        sscHscPerception(sscSample);
    }
}
