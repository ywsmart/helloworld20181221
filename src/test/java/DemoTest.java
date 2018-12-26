import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Function：
 *
 * @author YangWang
 * @date 2018-12-27
 * Created by YangWang on 2018-12-27 0:16.
 */
public class DemoTest {
    @Test
    public void test1(){
        assertTrue(false);
        assertEquals(1,2);
        assertEquals(3,4);
    }

    // 汇总断言失败
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Test
    public void test2(){
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
    }
}
