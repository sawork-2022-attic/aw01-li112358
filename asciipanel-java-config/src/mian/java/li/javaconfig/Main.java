package li.javaconfig;

import li.javaconfig.asciipanel.AsciiPanel;
import li.javaconfig.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class Main {

    static public void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
    }

}
