package shouty;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;


public class Hooks {

    @Before(value = "@positive" , order = 1)
    public void beforeMethod(){
        System.out.println("This is before method POSITIVE");
    }

    @Before({"@negative","@positive"})
    public void someBeforeMethod(){
        System.out.println("This is before method NEGATIVE");
    }

    @After()
    public void afterMethod(){
        System.out.println("This is after method first");
    }

    @After()
    public void someAfterMethod(){
        System.out.println("This is after method second");
    }



//
//
//    @AfterStep
//    public void afterStepMethod(){
//        System.out.println("This is after step method");
//    }
//
//    @BeforeStep
//    public void beforeStepMethod(){
//        System.out.println("This is before step method");
//    }

}
