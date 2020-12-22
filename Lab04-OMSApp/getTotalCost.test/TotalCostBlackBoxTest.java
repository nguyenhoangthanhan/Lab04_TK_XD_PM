import com.oms.bean.Book;
import com.oms.bean.Order;
import com.oms.bean.OrderLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.*;

@RunWith(Parameterized.class)
public class TotalCostBlackBoxTest {
    private Order order;
    private float ketQuaMongDoi;

    public TotalCostBlackBoxTest(Order order, float ketQuaMongDoi) {
    	super();
        this.order = order;
        this.ketQuaMongDoi = ketQuaMongDoi;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        //6 test
        return Arrays.asList(new Object[][]{
                {taoObjectOrder(5, 600000, "Hai Phong"), 600000},
                {taoObjectOrder(3, 300000, "Ha noi"), 322000},
                {taoObjectOrder(5,300000,"Hcm"), 322000},
                {taoObjectOrder(0.02, 400000, "Hai Duong"), 430000},
                {taoObjectOrder(2, 200000, "Hai duong"), 237500},
                {taoObjectOrder(30, 700000, "Ca Mau"), 700000}
        });
    }

    @Test
    public void testGetTotalCost() {
        assertEquals(order.getTotalCost() + "---" + ketQuaMongDoi, order.getTotalCost(), ketQuaMongDoi, 0.0);
    }
    
    public static Order taoObjectOrder(float weight, float cost, String address) {
    	Order order = new Order();
    	ArrayList<OrderLine> oArrayList = new ArrayList<OrderLine>();
    	OrderLine orderLine = new OrderLine();
    	Book book = new Book();
    	book.setWeight(weight);
    	book.setCost(cost);
        orderLine.setProductCost(cost);
        orderLine.setProductQuantity(1);
        orderLine.setProductWeight(weight);
        oArrayList.add(orderLine);
    	order.setOrderLines(oArrayList);
    	order.setCustomerAddress(address);
    	return order;
    }
}