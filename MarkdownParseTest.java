import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


  String[] result = {"https://something.com", "some-thing.html"};
  @Test
    public void contentEqual() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        for(int i = 0; i<links.size(); i++){
           assertEquals(links.get(i), result[i]);
        }
    }
}