package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.IncomingPhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.IncomingPhoneNumber;
import mx.onekey.dev.cpaas.api.domain.list.IncomingPhoneNumbersList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.PurchaseIncomingNumberParams;
import mx.onekey.dev.cpaas.api.params.UpdateIncomingNumberParams;

public class IncomingPhoneNumbersExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        IncomingPhoneNumbersConnector connector = ZangConnectorFactory.getIncomingPhoneNumbersConnector(conf);

        //view incoming phone number
        try {
            IncomingPhoneNumber number = connector.viewIncomingNumber("TestIncomingPhoneNumberSid");
            System.out.println(number.getPhoneNumber());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //list incoming phone numbers
        try {
            IncomingPhoneNumbersList numbers = connector.listIncomingNumbers("123", "MyNumber", 0, 25);
            for(IncomingPhoneNumber number : numbers) {
                System.out.println(number.getPhoneNumber());
            }
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //purchase incoming phone number
        try {
            IncomingPhoneNumber number = connector.purchaseIncomingNumber(PurchaseIncomingNumberParams.builder()
                    .setFriendlyName("MyNumber")
                    .setAreaCode("123")
                    .setVoiceCallerIdLookup(true)
                    .setVoiceApplicationSid("VoiceApplicationSid")
                    .setSmsApplicationSid("SmsApplicationSid")
                    .build());
            System.out.println(number.getSid());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //update incoming phone number
        try {
            IncomingPhoneNumber number = connector.updateIncomingNumber(UpdateIncomingNumberParams.builder()
                    .setIncomingPhoneNumberSid("TestIncomingPhoneNumberSid")
                    .setFriendlyName("MyFavoriteNumber")
                    .build());
            System.out.println(number.getPhoneNumber());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //delete incoming phone number
        try {
            IncomingPhoneNumber number = connector.deleteIncomingNumber("TestIncomingPhoneNumberSid");
            System.out.println(number.getPhoneNumber());
        } catch (ZangException e) {
            e.printStackTrace();
        }

    }

}
