import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        Cat been3 = (Cat) applicationContext.getBean("Cat" );
        Cat been4 = (Cat) applicationContext.getBean("Cat" );

        if (bean==bean2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if (been3==been4) {
            System.out.println(true);
        }else {
            System.out.println(false);;
        }
    }
}