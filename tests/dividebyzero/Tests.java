public class Tests {

    public static void testPlus() {
        int positive = 1;
        int negative= -1;
        int zero = 0;

        int test = 1 / (positive + zero);
        test = 1/ (zero + positive);
        test = 1/(zero + negative);
        test = 1/ (negative + zero);
        test = 1 / (positive + positive);
        test = 1 / (negative + negative);

        // :: error: divide.by.zero
        test = 1 / (zero + zero);

        // :: error: divide.by.zero
        test = 1 / (negative + positive);

        // :: error: divide.by.zero
        test = 1/ (positive + negative);
    }

    public static void testMinus() { 
        int positive = 1;
        int negative= -1;
        int zero = 0;

        int test = 1 / (positive - zero);
        test = 1/ (zero - positive);
        test = 1/(zero - negative);
        test = 1/ (negative - zero);

        // :: error: divide.by.zero
        test = 1 / (positive - positive);
        // :: error: divide.by.zero
        test = 1 / (negative - negative);

        // :: error: divide.by.zero
        test = 1 / (zero - zero);
        test = 1/ (negative - positive);
        test = 1 / (positive - negative);
    }

    public static void testTimes() { 
        int positive = 1;
        int negative= -1;
        int zero = 0;


        // :: error: divide.by.zero
        int test = 1 / (positive * zero);
        // :: error: divide.by.zero
        test = 1/ (zero * positive);
        // :: error: divide.by.zero
        test = 1/(zero * negative);
        // :: error: divide.by.zero
        test = 1/ (negative * zero);
        test = 1 / (positive * positive);
        test = 1 / (negative * negative);

        // :: error: divide.by.zero
        test = 1 / (zero * zero);
        test = 1/ (negative * positive);
        test = 1 / (positive * negative);
    }

    public static void testDivide() { 
        int positive = 1;
        int negative= -1;
        int zero = 0;


        // :: error: divide.by.zero
        int test = 1 / (positive / zero);
        // :: error: divide.by.zero
        test = 1/ (zero / positive);
        // :: error: divide.by.zero
        test = 1/ (zero / negative);
        // :: error: divide.by.zero
        test = 1/ (negative / zero);
        test = 1 / (positive / positive);
        test = 1 / (negative / negative);

        // :: error: divide.by.zero
        test = 1 / (zero / zero);

        
        test = 1/ (negative / positive);
        test = 1 / (positive / negative);
    }

    public static void testMod() { 
        int positive = 1;
        int negative= -1;
        int zero = 0;


        // :: error: divide.by.zero
        int test = 1 / (positive % zero);
        // :: error: divide.by.zero
        test = 1/ (zero % positive);
        // :: error: divide.by.zero
        test = 1/ (zero % negative);
        // :: error: divide.by.zero
        test = 1/ (negative % zero);
        test = 1 / (positive % positive);
        test = 1 / (negative % negative);

        // :: error: divide.by.zero
        test = 1 / (zero % zero);
        test = 1/ (negative % positive);
        test = 1 / (positive % negative);
    }

    public static void testOperators() { 
        int x = 1;
        x--;
        x--;

        int y = -1;
        y++;
        y++;

        int z = 1;
        z--;

        // x is non-zero, but x should be top at this point. So, test refiners. 
        if(x != 0){
            int test = 1 / x;
        }
        if (x < 0){
            int test = 1 / x;
        }
        if(x <= -1){
            int test = 1 / x;
        }
        if (x == -1){
            int test = 1 / x;
        }

        if(y != 0){
            int test = 1 / y;
        }
        if (y > 0){
            int test = 1 / y;
        }
        if(y >= 1){
            int test = 1 / y;
        }
        if (y == 1){
            int test = 1 / y;
        }

        if (y == 1){
            int test = 1 / y;
        }

        if (z == 0){
            // :: error: divide.by.zero
            int test = 1 / z;
        }
        

    }
    
}
