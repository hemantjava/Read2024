package org.dsa.dsa.solid.ocp.problem;

public class NotificationServiceImpl implements NotificationService {


    @Override
    public void sendOTP(String medium) {

        if (medium.equals("whatsapp")) {
            // Mobile api
        }
        if (medium.equals("email")) {
           // email api
        }
        if (medium.equals("mobile")) {
            // email api
        }
    }

    @Override
    public void sendTransactionReport(String medium) {
        //send to mobile or mail
    }
}
