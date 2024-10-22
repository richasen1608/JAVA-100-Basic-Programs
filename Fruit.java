public class Fruit {
    public static void main(String[] args) {
        String inventory="Apples 10, Bananas 5, Oranges 8, Apples 5, Grapes 12";
        CalculateChar(inventory);

    }
    public static void CalculateChar(String inventory){
        int[] freq=new int[128];
        inventory=inventory.toLowerCase();
        for(char ch:inventory.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                freq[ch]++;
            }
        }
        for(char ch='a';ch<='z';ch++){
            if(freq[ch]>0){
                System.out.println(ch+": "+freq[ch]);
            }
        }
        for(char ch='0';ch<='9';ch++){
            if(freq[ch]>0){
                System.out.println(ch+":"+freq[ch]);
            }
        }
    }
}
