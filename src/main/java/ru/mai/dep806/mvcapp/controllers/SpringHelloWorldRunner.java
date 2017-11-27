package ru.mai.dep806.mvcapp.controllers;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_hello_bean.xml");
        SpringHelloWorld message = (SpringHelloWorld) context.getBean("message");
        System.out.println("First bean");
        System.out.println(message.getMessage());

        System.out.println("=========================================");
        MessageToYou messageToYou = (MessageToYou) context.getBean("messageToYou");
        System.out.println("second bean");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());


        /*AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_hello_bean.xml");
        SpringHelloWorld message = (SpringHelloWorld) context.getBean("message");
        System.out.println("\n==================================");
        message.getHelloMessage();
        System.out.println("==================================\n");
        context.registerShutdownHook();*/



        /*ApplicationContext context = new FileSystemXmlApplicationContext("D:\\ФАЙЛИ\\JAVA\\1\\LEMANS\\src\\main\\resources\\spring_hello_bean.xml");
        SpringHelloWorld message = (SpringHelloWorld) context.getBean("message");
        message.setHelloMessage("This the first lady");
        message.getHelloMessage();

        SpringHelloWorld message_1 = (SpringHelloWorld) context.getBean("message");
        //message_1.setHelloMessage("This the second lady");
        message_1.getHelloMessage();*/

        /*XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring_hello_bean.xml"));
        SpringHelloWorld message = (SpringHelloWorld) xmlBeanFactory.getBean("message");
        message.getHelloMessage();*/


        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring_hello_bean.xml");
        SpringHelloWorld good = (SpringHelloWorld) context.getBean("good");
        good.getHelloMessage();*/
    }
}
