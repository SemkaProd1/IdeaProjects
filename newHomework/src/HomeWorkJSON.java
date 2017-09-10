import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class HomeWorkJSON {

       JSONObject ReadJSON() throws IOException, ParseException {

               JSONParser jsonParser = new JSONParser();
               JSONObject jsonObject;
               jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\SemkaProd\\IdeaProjects\\newHomework\\src\\testWrite.json"));
               return jsonObject;
       }

    void WriteJSON(JSONObject jsonObject) throws IOException {
        File file = new File("C:\\Users\\SemkaProd\\IdeaProjects\\newHomework\\src\\testWrite.json");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(jsonObject));
        writer.flush();
    }
}