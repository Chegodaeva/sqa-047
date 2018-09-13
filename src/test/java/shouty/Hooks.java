package shouty;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

    @Before
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @After()
    public void afterMethod(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println(scenario.getName() + "is failed");
        };
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
