package builder;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //PolicyService policyService = new PolicyService();
        //policyService.setDriverAge(12);

        PolicyService policyService1 = PolicyService.builder()
                .driverAge(6)
                .numberOfAccidence(2)
                .driverExperience(5)
                .x(4)
                .build();

        //PolicyService policyService2 = new PolicyService(6,2,5,4);

        System.out.println(policyService1);

    }
}