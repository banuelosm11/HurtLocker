import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        //String output = (new Main()).readRawDataToString();
       // System.out.println(output);

        Parser parser = new Parser();

        System.out.println(parser.matchPricePattern("naMe:Milk;price:3.23;type:Food;expiration:1/25/2016"));

    }
}
