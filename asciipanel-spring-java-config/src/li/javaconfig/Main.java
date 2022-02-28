package li.javaconfig;

import li.javaconfig.asciipanel.AsciiPanel;
import li.javaconfig.asciipanel.AsciiFont;
import li.javaconfig.config.AsciiPanelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);

        AsciiPanel asciiPanel_8x8 = context.getBean("asciiPanel_8x8", AsciiPanel.class);
        AsciiPanel asciiPanel_9x16 = context.getBean("asciiPanel_9x16", AsciiPanel.class);

        System.out.println("asciiPanel_8x8 : " + asciiPanel_8x8.getAsciiFont().getFontFilename());
        System.out.println("asciiPanel_9x16 : " + asciiPanel_9x16.getAsciiFont().getFontFilename());

    }

}
