package Opgave;

public class Cypher {
    BokstavSystem bs = new BokstavSystem();

    public String cypher(String input, int Secret) {

        String tempstr = input.toLowerCase();
        String returnString="";

        // Creating array of string length
        char[] ch = new char[tempstr.length()];

        // Copy character by character into array
        for(int i=0;i<tempstr.length();i++) {
            ch[i] = tempstr.charAt(i);
        }

        // tilføjer hvert bokstav til en concat string som så bliver return værdi
        for (char c: ch){

            // når der kommer en numeric value over 35 går den over til andre værdier og jeg
            // kan vist ikke selv sætte en "numeric value" spørg læren
            char tempChar= (char) (c+Secret);
            //hvis return char værdi er over 35 skal den begynde fra 10 og tælle videre
            if(Character.getNumericValue(c)+Secret>35){
                tempChar = (char) ((c+Secret)-26);
                returnString += ""+tempChar;
            }
            else if (Character.getNumericValue(c)+Secret<10){
                tempChar= (char) ((c+Secret)+26);
                returnString += ""+tempChar;
            }
            // ellers så bare sætte værdien af tempchar på returnString
            else{
                returnString += ""+tempChar;
            }
        }

return returnString;

    }
}
