package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testrun {
    public static void main(String args[]){
        Result res=JUnitCore.runClasses(OperationsTest.class);
        for(Failure fail : res.getFailures()){
            System.out.println(fail.toString());
        }
        Result resm=JUnitCore.runClasses(testcalc.class);
        for(Failure fail : resm.getFailures()){
            System.out.println(fail.toString());
        }
        System.out.println(res.wasSuccessful());
        System.out.println(resm.wasSuccessful());
    }
}
