package net.montaki;

public class DefaultStratImp implements Strategy {
    @Override
    public void OperationStrategy() {
        System.out.println("+++Default Strategy+++");
    }
}