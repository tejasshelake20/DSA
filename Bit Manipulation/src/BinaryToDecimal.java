public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binary_to_decimal("101"));
    }

    static int binary_to_decimal(String s){
        int decimal = 0;
        int p2 = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1'){
                decimal = decimal + p2;
            }
            p2 = p2 * 2;
        }
        return decimal;
    }
}
