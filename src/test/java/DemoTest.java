import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.model.Stage;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
    @DisplayName("Demo1 displayname")
    @Description("超级大傻逼")
    @Link("https://testerhome.com")
    @Issue("110")
    @Severity(SeverityLevel.MINOR)
    public void test1(){
        login();
        login();
        login();
        // 测试步骤动态生成,也可以动态打log
        StepResult stepResult = new StepResult();
        stepResult.setStatus(Status.FAILED);
        stepResult.setName("new step name");
        Allure.getLifecycle().startStep("new step",stepResult);
        Allure.getLifecycle().stopStep();
        assertTrue(false);
        assertEquals(1,2);
        assertEquals(3,4);
    }
    // 标记步骤
    @Step("login step name")
    public void login(){
        try {
            // 引用截图图片
            Allure.addAttachment("demo picture","image/png"
                    ,new FileInputStream("C:\\Users\\YangWang\\Desktop\\1.png")
                    ,".png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("login step");
    }

    // 汇总断言失败
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Test
    public void test2(){
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
    }
}
