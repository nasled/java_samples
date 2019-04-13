import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class domParserDTD extends Base {

    domParserDTD(String document, String schema) {
        super(document, schema);
    }

    public boolean run() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setAttribute(
                "http://java.sun.com/xml/jaxp/properties/schemaLanguage",
                XMLConstants.W3C_XML_SCHEMA_NS_URI
        );
        factory.setAttribute(
                "http://java.sun.com/xml/jaxp/properties/schemaSource",
                schema
        );

        DocumentBuilder parser = factory.newDocumentBuilder();
        parser.setErrorHandler(new ErrorHandler() {
            public void warning(SAXParseException e) throws SAXException {}

            public void error(SAXParseException e) throws SAXException { }

            public void fatalError(SAXParseException e) throws SAXException { }
        });

        Boolean isValid;

        try{
            Document document = parser.parse(this.document);
            isValid = true;
        } catch (Exception e) {
            isValid = false;
        }

        return isValid;
    }
}
