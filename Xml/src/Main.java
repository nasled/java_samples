import java.nio.file.Paths;

public class Main {

    public static final String XML_DOCUMENT = "/src/document.xml";
    public static final String XSD_SCHEMA = "/src/schema.xsd";
    public static final String DTD_SCHEMA = "/src/document.dtd";

    public static String getPath() {
        return Paths.get(".").toAbsolutePath().normalize().toString();
    }

    public static void main(String[] args) throws Exception {
        domParserSchema xsdValidation = new domParserSchema(
                getPath() + XML_DOCUMENT,
                getPath() +XSD_SCHEMA
        );
        Boolean isXsdValid = xsdValidation.run();
        System.out.println("XSD validation result: " + isXsdValid);

        domParserDTD dtdValidation = new domParserDTD(
                getPath() + XML_DOCUMENT,
                getPath() + DTD_SCHEMA
        );
        Boolean isDtdValid = xsdValidation.run();
        System.out.println("DTD validation result: " + isDtdValid);
    }
}
