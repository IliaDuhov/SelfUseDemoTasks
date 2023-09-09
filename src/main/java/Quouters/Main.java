package Quouters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        while(true){
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
