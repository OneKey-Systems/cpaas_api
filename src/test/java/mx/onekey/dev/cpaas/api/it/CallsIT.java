package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.CallsConnector;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.MakeCallParams;
import org.junit.Test;

public class CallsIT extends BaseIntegrationTest {


    private final CallsConnector conn;

    public CallsIT() throws ZangException {
        conn = connectorFactory.getCallsConnector();
    }

    @Test
    public void makeCall() throws ZangException {
        conn.makeCall(MakeCallParams.builder()
                .setRecord(true)
                .setFrom(testParameters.getPhone2())
                .setTo(testParameters.getPhone1())
                .setUrl(testParameters.getInboundXmlUrl())
                .build());
    }

}
