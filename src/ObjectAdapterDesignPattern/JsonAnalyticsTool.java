package ObjectAdapterDesignPattern;

public class JsonAnalyticsTool {

    private String jsonData;

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public void analyse() {
        if(jsonData.contains("json")) {
            System.out.println("Analyzing the json " + jsonData);
        }
        else{
            System.out.println("Can't analyze this data. Incorrect format");
        }
    }
}
