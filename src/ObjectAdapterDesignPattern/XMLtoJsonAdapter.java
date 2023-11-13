package ObjectAdapterDesignPattern;

public class XMLtoJsonAdapter implements AnalyticsTool {

    private JsonAnalyticsTool jsonAnalyticsTool = new JsonAnalyticsTool();

    public XMLtoJsonAdapter(String xmlData) {
        System.out.println("Converting the xml data to json");
        String newData = xmlData + " in json";
        jsonAnalyticsTool.setJsonData(newData );
    }
    @Override
    public void analyseData() {
        jsonAnalyticsTool.analyse();
    }
}
