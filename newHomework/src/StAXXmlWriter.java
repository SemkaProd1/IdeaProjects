import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by SemkaProd on 10.09.2017.
 */
public class StAXXmlWriter {

    public static void main(String[] args) {


    XMLOutputFactory factory      = XMLOutputFactory.newInstance();
    try {
       XMLStreamWriter writer = factory.createXMLStreamWriter(
                new FileWriter("C:\\Users\\SemkaProd\\IdeaProjects\\newHomework\\src\\StAX.xml"));

        writer.writeStartDocument("UTF-8","1.0");
        writer.writeStartElement("company");
        writer.writeStartElement("Staff");
        writer.writeAttribute("id", "1");
        writer.writeStartElement("firstname");
        writer.writeCharacters("Antony");
        writer.writeEndElement();
        writer.writeStartElement("lastname");
        writer.writeCharacters("Keed");
        writer.writeEndElement();
        writer.writeStartElement("nickname");
        writer.writeCharacters("Lexus SE");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();

    } catch (XMLStreamException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}