package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.AvailablePhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.enums.AvailableNumberType;
import mx.onekey.dev.cpaas.api.domain.list.AvailablePhoneNumbersList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.ListAvailableNumbersParams;


public class AvailablePhoneNumbersExample  {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        AvailablePhoneNumbersConnector connector = new ZangConnectorFactory(conf).getAvailablePhoneNumbersConnector();


        //list available numbers
        try {
            AvailablePhoneNumbersList numbers = connector.listAvailableNumbers(ListAvailableNumbersParams.builder()
                    .setCountry("HR")
                    .setType(AvailableNumberType.TOLLFREE)
                    .setContains("123")
                    .setAreaCode("052")
                    .setInRegion("Istria")
                    .setInPostalCode("52210")
                    .setPage(0)
                    .setPageSize(20)
                    .build());
            System.out.println(numbers.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }

}

