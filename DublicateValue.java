package Interview_Question;


public class DublicateValue {
    public static void main(String[] args) {
        String string1 = "aabbbaaccabbaa";
        int count;
        //Converts given string into character array
        char []string = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to ' ' to avoid printing visited character
                    string[j] = ' ';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != ' ')
                System.out.print(string[i]+" ");
        }
    }
}
