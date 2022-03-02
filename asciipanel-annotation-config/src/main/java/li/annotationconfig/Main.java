package li.annotationconfig;

import li.annotationconfig.asciipanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    static public void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationconfig.xml");
        AsciiPanel asciiPanel= context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
    }

}
