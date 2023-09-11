package Quouters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(Quoter.class).sayQuote();
        /*while(true){
            Thread.sleep(100);// в ProfilingController поставь true и увидишь время профилрования
            context.getBean(Quoter.class).sayQuote();
        }*/
    }
}
