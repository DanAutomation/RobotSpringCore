import impl.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object obj = context.getBean("t1000");

        if(obj instanceof ModelT1000) {

            ModelT1000 t1000 = (ModelT1000) obj;
            t1000.protect();
        }
    }
}
