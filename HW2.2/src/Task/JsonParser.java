package Task;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class JsonParser {
    public static void main() throws JSONException {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        parseJsonString(jsonString);
    }

    public static void parseJsonString(String jsonString) throws JSONException {
        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(jsonString);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String surname = jsonObject.getString("фамилия");
            String grade = jsonObject.getString("оценка");
            String subject = jsonObject.getString("предмет");
            stringBuilder.append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(grade)
                    .append(" по предмету ")
                    .append(subject)
                    .append(".\n");
        }
        System.out.println(stringBuilder.toString());
    }
}