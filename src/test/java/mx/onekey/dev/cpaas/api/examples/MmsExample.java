package mx.onekey.dev.cpaas.api.examples;

import java.net.URI;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.MmsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.MmsMessage;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;

public class MmsExample {

	public static void main(String[] args) {
		BasicZangConfiguration conf = new BasicZangConfiguration();
		conf.setSid("{AccountSid}");
		conf.setAuthToken("{AuthToken}");
		MmsConnector conn = ZangConnectorFactory.getMmsConnector(conf);

		// send mms message
		try {
			MmsMessage sentMmsMessage = conn.sendMmsMessage("(XXX) XXX-XXXX", "(XXX) XXX-XXXX",
					"This is an MMS message sent from the Zang Java wrapper! Easy as 1, 2, 3!", null,
					URI.create("https://media.giphy.com/media/zZJzLrxmx5ZFS/giphy.gif"));

			System.out.println(sentMmsMessage.getMmsSid());

		} catch (ZangException e) {
			e.printStackTrace();
		}
	}
}
