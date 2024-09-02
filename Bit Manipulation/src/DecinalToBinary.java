public class DecinalToBinary {
    public static void main(String[] args) {
        System.out.println(decimal_to_binary(6));
    }
    static String decimal_to_binary(int decimal){
        String binary = "";
        while(decimal != 0){
            int rem = decimal % 2;
            binary = rem + binary;
            decimal = decimal / 2;
        }
        return binary;
    }
}
