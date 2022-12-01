import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String text = "I shall call him squishy and he shall be mine and he shall be my squishy";
        String key = "KEY";

        System.out.println(Encrypt(text, key).toUpperCase());
    }


    public static String Encrypt(String text, String key){
        text = text.toLowerCase();
        key = key.toLowerCase();
        text = text.replaceAll("\\s+","");
        StringBuilder endtxt = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            char k = key.charAt(i%key.length());

            int temp = (c + k);
            if (temp > 219){
                char app = (char) (temp - 123);
                endtxt.append(app);
            }else{
                char app = (char) (temp - 97);
                endtxt.append(app);
            }

        }
        return endtxt.toString();
    }
}

//SWFKPJMEJVLGWWOEMQRCYXHFOWFKPJLIKSRCKRBRIQREJVFCWCQAYGCLW

//219