package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.RecordingsConnector;
import mx.onekey.dev.cpaas.api.domain.Call;
import mx.onekey.dev.cpaas.api.domain.list.CallsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Test;

public class RecordingsIT extends BaseIntegrationTest {


    private final RecordingsConnector conn;

    public RecordingsIT() throws ZangException {
        conn = connectorFactory.getRecordingsConnector();
    }

    @Test
    public void listRecordings() throws ZangException {
        CallsList calls = connectorFactory.getCallsConnector().listCalls();
        for (Call call : calls) {
            conn.listRecordings(call.getSid(), null, null, 0, 50);
        }
    }

}
