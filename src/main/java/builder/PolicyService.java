package builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@Data
public class PolicyService {
    @NonNull
    private int driverAge;
    @NonNull
    private final int numberOfAccidence;
    @NonNull
    private int driverExperience;
    @NonNull
    private int x;

     PolicyService(int driverAge, int numberOfAccidence, int driverExperience, int x) {
        this.driverAge = driverAge;
        this.numberOfAccidence = numberOfAccidence;
        this.driverExperience = driverExperience;
        this.x = x;
    }

    public static PolicyServiceBuilder builder() {
        return new PolicyServiceBuilder();
    }

    public static class PolicyServiceBuilder {
        private int driverAge;
        private int numberOfAccidence;
        private int driverExperience;
        private int x;

        PolicyServiceBuilder() {
        }

        public PolicyServiceBuilder driverAge(int driverAge) {
            this.driverAge = driverAge;
            return this;
        }

        public PolicyServiceBuilder numberOfAccidence(int numberOfAccidence) {
            this.numberOfAccidence = numberOfAccidence;
            return this;
        }

        public PolicyServiceBuilder driverExperience(int driverExperience) {
            this.driverExperience = driverExperience;
            return this;
        }

        public PolicyServiceBuilder x(int x) {
            this.x = x;
            return this;
        }

        public PolicyService build() {
            return new PolicyService(driverAge, numberOfAccidence, driverExperience, x);
        }

        public String toString() {
            return "PolicyService.PolicyServiceBuilder(driverAge=" + this.driverAge + ", numberOfAccidence="
                    + this.numberOfAccidence + ", driverExperience=" + this.driverExperience + ", x=" + this.x + ")";
        }
    }
}