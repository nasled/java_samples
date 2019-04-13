import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class domParserSchema extends Base {

    domParserSchema(String document, String schema) {
        super(document, schema);
    }

    public boolean run() throws Exception {
        // parse an XML document into a DOM tree
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document parsedDocument = builder.parse(new File(document));

        // create a SchemaFactory capable of understanding WXS schemas
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // load a WXS schema, represented by a Schema instance
        Source schemaFile = new StreamSource(new File(schema));
        Schema schema = factory.newSchema(schemaFile);

        // create a Validator instance, which can be used to validate an instance document
        Validator validator = schema.newValidator();

        // store result
        Boolean isValid;

        try {
            // validate the DOM tree
            validator.validate(new DOMSource(parsedDocument));
            isValid = true;
        } catch (Exception e) {
            isValid = false;
        }

        // if we need to traverse
//        Element root= parsedDocument.getDocumentElement();
//        System.out.println("root: " + root.getNodeName());
//        for(Node node = root.getFirstChild(); node!=null; node=node.getNextSibling()) {
//            String name = node.getNodeName();
//            String value = node.getTextContent().trim();
//            System.out.println("attr name: "  + name + "; attr value: " + value);
//        }

        return isValid;
    }
}
