package lessone9;

public enum StatusEnum {
    NEW(15003),
    IMPORT_ERROR(15033),
    EXECUTED(17043);

    private final int code;

    StatusEnum(int code) {
        this.code = code;
    }
}
