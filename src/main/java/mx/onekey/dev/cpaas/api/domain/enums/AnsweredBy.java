package mx.onekey.dev.cpaas.api.domain.enums;

import org.codehaus.jackson.annotate.JsonCreator;

public enum AnsweredBy {
    HUMAN, MACHINE, TBD, UNKNOWN;

    @JsonCreator
    public static AnsweredBy forValue(String s) {
        if (s == null) return null;
        if (s.equals("human")) return HUMAN;
        if (s.equals("machine")) return MACHINE;
        if (s.equals("tbd")) return TBD;
        return UNKNOWN;
    }
}