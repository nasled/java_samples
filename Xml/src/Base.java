abstract class Base {
    String document;
    String schema;

    Base(String document, String schema) {
        this.document = document;
        this.schema = schema;
    }

    abstract boolean run() throws Exception;
}
