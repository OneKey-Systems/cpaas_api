package mx.onekey.dev.cpaas.api.inboundxml.elements.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "tts_languages")
@XmlEnum
public enum Language {

    /*
    * Available languages as of August 17, 2021 according to Avaya's InboundXML documentation.
    * https://docs.avayacloud.com/aspx/inboundxml#say
    * */
    @XmlEnumValue("cy-gb") CY("cy-gb"),
    @XmlEnumValue("da-dk") DA("da-dk"),
    @XmlEnumValue("de-de") DE("de-de"),
    @XmlEnumValue("en-au") EN_AU("en-au"),
    @XmlEnumValue("en-gb") EN_GB("en-gb"),
    @XmlEnumValue("en-gb-wls") EN_GB_WLS("en-gb-wls"),
    @XmlEnumValue("en-in") EN_IN("en-in"),
    @XmlEnumValue("en-us") EN("en-us"),
    @XmlEnumValue("es-es") ES("es-es"),
    @XmlEnumValue("es-us") ES_US("es-us"),
    @XmlEnumValue("fr-ca") FR_CA("fr-ca"),
    @XmlEnumValue("fr-fr") FR("fr"),
    @XmlEnumValue("is-is") IS("is-is"),
    @XmlEnumValue("it") IT("it"),
    @XmlEnumValue("ja-jp") JA("ja-jp"),
    @XmlEnumValue("nb-no") NB("nb-no"),
    @XmlEnumValue("nl-nl") NL("nl-nl"),
    @XmlEnumValue("pl-pl") PL("pl-pl"),
    @XmlEnumValue("pt-br") PT_BR("pt-br"),
    @XmlEnumValue("pt-pt") PT("pt-pt"),
    @XmlEnumValue("ro-ro") RO("ro-ro"),
    @XmlEnumValue("ru-ru") RU("ru-ru"),
    @XmlEnumValue("sv-se") SV("sv-se"),
    @XmlEnumValue("tr-tr") TR("tr-tr");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c : Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
