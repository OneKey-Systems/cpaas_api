package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.SmsConnector;
import mx.onekey.dev.cpaas.api.domain.SmsMessage;
import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;
import mx.onekey.dev.cpaas.api.domain.enums.SmsDirection;
import mx.onekey.dev.cpaas.api.domain.list.SmsMessageList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;


public class SmsTest extends BaseUnitTest {

    @Test
    public void viewSms() throws ZangException, IOException {
        createExpectation("SmsTest", "viewSms");
        SmsConnector connector = connectorFactory.getSmsConnector();
        SmsMessage smsMessage = connector.viewSmsMessage("TestSmsSid");
        checkMessage(smsMessage);
    }

    @Test
    public void listSms() throws ZangException, IOException {
        createExpectation("SmsTest", "listSms");
        SmsConnector connector = connectorFactory.getSmsConnector();
        SmsMessageList smsMessages = connector.listSmsMessages("+123456", null, null, null, 0, 10);
        int cnt = 0;
        Iterator<SmsMessage> it = smsMessages.iterator();
        SmsMessage fromList = null;
        while(it.hasNext()) {
            cnt++;
            fromList = it.next();
        }
        Assert.assertEquals(2, cnt);
        Assert.assertEquals(1, (int)smsMessages.getNumpages());
        checkMessage(fromList);

    }

    @Test
    public void sendSms() throws ZangException, IOException {
        createExpectation("SmsTest", "sendSms");

        SmsConnector connector = connectorFactory.getSmsConnector();
        SmsMessage smsMessage = connector.sendSmsMessage("+123456", "+654321",
                "test from java", "callback.url", HttpMethod.GET, false);
        checkMessage(smsMessage);

    }

    private void checkMessage(SmsMessage msg) {
        Assert.assertEquals("test from java", msg.getBody());
        Assert.assertEquals("sent", msg.getStatus());
        Assert.assertEquals(SmsDirection.OUTBOUND_API, msg.getDirection());
        Assert.assertEquals(new BigDecimal("0.0616"), msg.getPrice());
    }

}
