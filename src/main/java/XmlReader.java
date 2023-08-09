import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;

public class XmlReader {
        public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
            // Step 1: Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Step 2: Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Step 3: Parse the XML file to create a Document object
            Document document = builder.parse("src/main/resources/hello.xml");

            // Step 4: Get the root element of the XML
            Element root = document.getDocumentElement();

            // Step 5: Get the list of "person" elements
            NodeList personList = root.getElementsByTagName("person");

            // Step 6: Loop through the "person" elements and read data
            for (int i = 0; i < personList.getLength(); i++) {
                Element personElement = (Element) personList.item(i);
                String name = personElement.getElementsByTagName("name").item(0).getTextContent();
                int age = Integer.parseInt(personElement.getElementsByTagName("age").item(0).getTextContent());
                String city = personElement.getElementsByTagName("city").item(0).getTextContent();

                // Step 7: Do something with the data (e.g., print it)
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("City: " + city);
                System.out.println("---------------");

            }
        }

        }


