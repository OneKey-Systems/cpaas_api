package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.inboundxml.ZangInboundXml;
import mx.onekey.dev.cpaas.api.inboundxml.elements.Say;
import mx.onekey.dev.cpaas.api.inboundxml.elements.enums.Language;
import mx.onekey.dev.cpaas.api.inboundxml.elements.enums.Voice;

public class InboundXmlExample {

    public static void main(String[] args) {
        try {
            String result = ZangInboundXml.builder()
                    .say(Say.builder()
                            .setLanguage(Language.EN)
                            .setLoop(3)
                            .setText("Welcome to Zang!")
                            .setVoice(Voice.FEMALE)
                            .build())
                    .build()
                    .toXml();
            System.out.println(result);
        } catch (ZangException e) {
            e.printStackTrace();
        }

    }

}
