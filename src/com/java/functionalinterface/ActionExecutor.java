package com.java.functionalinterface;
interface MessageDispaly{
    static void showMassage(){
        System.out.println("Welcome");
    }
    void executeCustomAction(String input);
}
public class ActionExecutor implements MessageDispaly{
    public static void main(String[] args) {
        ActionExecutor executor = new ActionExecutor();
        // Call the static method from the MessageDisplay interface to show the static message.
        MessageDispaly.showMassage();
        // Call the implemented abstract method with a custom message.
        executor.executeCustomAction("Overridden Message: Action Completed.");
    }

    @Override
    public void executeCustomAction(String input) {
        System.out.println("Change"+input);
    }
}
