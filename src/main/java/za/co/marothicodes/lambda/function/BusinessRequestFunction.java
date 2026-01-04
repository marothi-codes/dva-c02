package za.co.marothicodes.lambda.function;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
public class BusinessRequestFunction {
    public String handle(Map<String, Object> event) {
        System.out.println("BusinessRequestFunction invoked with event: " + event);
        return "OK";
    }
}
