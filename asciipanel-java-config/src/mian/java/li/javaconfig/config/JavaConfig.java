package li.javaconfig.config;

import li.javaconfig.asciipanel.AsciiPanel;
import li.javaconfig.asciipanel.AsciiFont;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JavaConfig {
    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel();
    }

    @Bean
    public AsciiFont asciiFont(){
        return new AsciiFont();
    }

    @Bean(name="height")
    public int height(){
        return 16;
    }

    @Bean(name="width")
    public int width(){
        return 9;
    }

    @Bean
    @Primary
    public String fontFileName1(){
        return "cp437_8x8.png";
    }

    @Bean
    //@Primary
    public String fontFileName2(){
        return "cp437_9x16.png";
    }

}
