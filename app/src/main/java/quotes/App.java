/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        File jsonFile = new File("app/src/main/resources/recentquotes.json");
        FileReader jsonFileReader = new FileReader(jsonFile);
        Type collectionType = new TypeToken<Collection<Quotes>>(){}.getType();
        ArrayList<Quotes> quotesArrayList = gson.fromJson(jsonFileReader, collectionType);
        System.out.println(quotesArrayList.get(9).text);

    }
}






//How do I use GSON?
//What class(es) should I write to encapsulate this functionality?
//How does the App class use the class(es) I write?
//How do I test this functionality?