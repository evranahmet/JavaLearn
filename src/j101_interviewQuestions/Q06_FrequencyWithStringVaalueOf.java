package j101_interviewQuestions;

public class Q06_FrequencyWithStringVaalueOf {
    /* Task->
  Count the frequency of the letters in a given String as the format below:
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
  "Java is so Good" stringi için kullanılan harflern tekrarını print eden code create ediniz.
   */
    public static void main(String[] args) {

        String str = "Java is so Good";
        String output="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (!output.contains(String.valueOf(str.charAt(i)))){
                output+=""+str.charAt(i)+count+" ";
            }
        }
        System.out.println("output = " + output);


    }
}
