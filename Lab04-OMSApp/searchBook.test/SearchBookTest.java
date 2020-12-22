import org.junit.Test;
import com.oms.bean.Book;
import com.oms.serverapi.MediaApi;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchBookTest {
    private MediaApi api = new MediaApi();

    @Test
    public void testSearchBooks() {
        Map<String, String> map = new HashMap<>();
        map.put("title", "C");
        ArrayList<Book> list= api.getBooks(map);
        assertEquals("Error in getBooks API!", list.size(), 1);
    }
}

