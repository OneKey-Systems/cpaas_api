package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.UsagesConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Usage;
import mx.onekey.dev.cpaas.api.domain.enums.Product;
import mx.onekey.dev.cpaas.api.domain.list.UsagesList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.ListUsagesParams;

import java.math.BigDecimal;

public class UsagesExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        UsagesConnector conn = new ZangConnectorFactory(conf).getUsagesConnector();

        //view usage
        try {
            //get a specific usage
            Usage usage = conn.viewUsage("{UsageSid}");
            System.out.println(usage.getTotalCost());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //list usages
        try {
            ListUsagesParams usagesRequest = ListUsagesParams.builder()
                    .setProduct(Product.OUTBOUND_SMS)
                    .setYear(2017)
                    .setMonth(2)
                    .setPageSize(100)
                    .build();
            UsagesList usagesList = conn.listUsages(usagesRequest);
            BigDecimal total = BigDecimal.ZERO;
            for (Usage usage : usagesList) {
                total = total.add(usage.getTotalCost());
            }
            System.out.println(total);
        } catch (ZangException e) {
            e.printStackTrace();
        }

    }

}
