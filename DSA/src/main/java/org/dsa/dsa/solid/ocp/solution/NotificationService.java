package org.dsa.dsa.solid.ocp.solution;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
