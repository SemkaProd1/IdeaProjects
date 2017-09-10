import org.json.simple.JSONObject;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by SemkaProd on 10.09.2017.
 */
public class HomeWorkJSONTest {

    @Test
    public void test1() throws IOException {

        JSONObject object = new JSONObject();
        HomeWorkJSON homeWorkJSON = new HomeWorkJSON();

        object.put("1", "Korona");
        object.put("2", "Milka");
        object.put("3", "Roshen");

        homeWorkJSON.WriteJSON(object);
        HomeWorkJSON homeWorkJSON1 = new HomeWorkJSON();
        JSONObject ff = new JSONObject();
        try {
            ff = homeWorkJSON1.ReadJSON();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        assertEquals(object,ff);
    }
}