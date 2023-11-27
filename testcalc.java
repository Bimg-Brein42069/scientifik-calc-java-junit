package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class testcalc {
    String[] testcases={"2 1 94 52 54 3"
            ,"2 2 94 52 54 3"
            ,"2 3 59 6 54 3"
            ,"2 4 54 9 54 3"
            ,"2 5 16 54 3"
            ,"2 6 4 7 54 3"
            ,"2 7 45 54 3"
            ,"2 8 45 54 3"
            ,"2 9 45 54 3"
            ,"2 10 45 54 3"
            ,"2 11 45 54 3"
            ,"2 12 45 54 3"
            ,"2 23 7 0.875 54 3"
            ,"2 23 8 0.875 54 3"
            ,"2 23 9 0.875 54 3"
            ,"2 23 10 0.875 54 3"
            ,"2 23 11 0.875 54 3"
            ,"2 23 12 0.875 54 3"
            ,"2 13 50 54 3"
            ,"2 14 50 54 3"
            ,"2 15 50 54 3"
            ,"2 16 -12.25 54 3"
            ,"2 17  12.25 54 3"
            ,"2 18 12.25 54 3"
            ,"2 19 13.87 54 3"
            ,"2 20 7 2 54 3"
            ,"2 21 1 54 3"
            ,"2 22 1 54 3"
            ,"2 24 60 54 3"
            ,"2 25 0.65 54 3"
            ,"2 26 3 1 2 54 3"
            ,"2 27 3 1 2 54 3"
            ,"2 28 6 54 3"
            ,"2 29 8 3 54 3"
            ,"2 30 9 54 3"
            ,"2 31 -9 54 3"
            ,"2 32 86 78 54 3"
            ,"2 33 54 67 54 3"
            ,"2 34 1 2 54 3"
            ,"2 35 1 2 54 3"
            ,"2 36 1 2 54 3"
            ,"2 37 5 54 3"
            ,"2 38 5 9 54 3"
            ,"2 39 2.2 54 3"
            ,"2 40 8.8 54 3"
            ,"2 41 2 54 3"
            ,"2 42 3 54 3"
            ,"2 43 0.5 54 3"
            ,"2 44 0.866 54 3"
            ,"2 23 44 0.866 54 3"
            ,"2 45 0.5 54 3"
            ,"2 23 45 0.5 54 3"
            ,"2 46 1 54 3"
            ,"2 23 46 1 54 3"
            ,"2 47 1 0 54 3"
            ,"2 48 1 0 54 3"
            ,"2 49 12 54 3"
            ,"2 50 13 54 3"
            ,"2 51 9 54 3"
            ,"2 52 0 4 54 3"
            ,"2 52 1 4 54 3"
            ,"2 53 1 54 3"};
    double[] testvalues={146
            ,42
            ,354
            ,6
            ,4
            ,16384
            ,0.7071067812
            ,0.7071067812
            ,1
            ,1.4142135624
            ,1.4142135624
            ,1
            ,0.7675435022
            ,0.6409968582
            ,1.1974216292
            ,1.5600700491
            ,1.3028577495
            ,0.8351277241
            ,1.6989700043
            ,3.9120230054
            ,5.6438561898
            ,12.25
            ,13
            ,12
            ,14
            ,0.3562071871
            ,1
            ,2.7182818285
            ,1.0471975512
            ,37.2422566823
            ,16
            ,4
            ,36
            ,2
            ,81
            ,-729
            ,78
            ,67
            ,1.5
            ,1.4142135624
            ,1.3333333333
            ,0.2
            ,55.55555556
            ,3
            ,8
            ,3.6268604078
            ,10.0676619958
            ,0.4621171573
            ,59.9970890688
            ,1.0471467459
            ,30.0029109312
            ,0.5236495809
            ,45.0000000000
            ,0.7853981634
            ,1
            ,1
            ,78
            ,819
            ,2025
            ,0
            ,1
            ,1};
    @Test
    public void testing(){
        for(int i=0;i<62;i++) {
            ScientificCalculatorTest calc = new ScientificCalculatorTest(testcases[i]);
            double k = 1e-6;
            double ret = calc.run();
            double expt = testvalues[i];
            try {
                assertEquals(expt, ret, 1e-6);
            }
            catch(AssertionError e){
                System.out.println("Testcase " + (i+1) + " failed");
                e.printStackTrace(System.out);
            }
        }
    }
}