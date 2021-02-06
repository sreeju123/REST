import org.json.simple.JSONObject;

public class JSON {


    public JSONObject userBody(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","Messi");
        jsonObject.put("job","Footballer");
        return jsonObject;
    }
}
