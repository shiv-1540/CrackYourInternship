#TRY 1
String roundToNearest(String str) {
        // Complete the function
           BigInteger a=new BigInteger(str);
           BigInteger ten=new BigInteger(str);
           
           int ld=Character.getNumericValue(str.charAt(str.length()));
           
           if(ld<=5){
               a=a.substract(new BigInteger(String.valueOf(ld)));
           }
           else{
                a=a.add(ten.substract(String.valueOf(ld)));
           }
           return a;
    }

#TRY 2
  String roundToNearest(String str) {
        // Complete the function
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        int last = sb.charAt(n-1) - '0';

        if (last <= 5) {
            sb.setCharAt(n-1, '0');
            return sb.toString();
        }

        sb.setCharAt(n-1, '0'); // Set last digit to '0'
        int carry = 1;
        for (int i = n - 2; i >= 0 && carry > 0; i--) {
            int x = sb.charAt(i) - '0';
            x = x + carry;
            carry = x / 10;
            sb.setCharAt(i, (char) ('0' + (x % 10)));
        }

        if (carry > 0) {
            sb.insert(0, '1'); // Handle overflow case
        }

        return sb.toString();
    }

