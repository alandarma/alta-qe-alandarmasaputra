public class Palindrome {

    public static void main(String [] args){
        String text = "KataK";
        String textB = "KupuKupu";

        String temp = "";
        for(int i=text.length()-1; i>=0; i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }
        String tempt = "";
        for(int i=textB.length()-1; i>=0; i--){
            char c = textB.charAt(i);
            tempt += String.valueOf(c);
        }
        if (text.equals(temp)){
            System.out.println("Mengecek Kata Palindrome");
            System.out.println("Katak = True");
        }
            System.out.println("KupuKupu = False");

    }
}
