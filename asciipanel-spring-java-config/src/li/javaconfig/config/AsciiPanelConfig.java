package li.javaconfig.config;

import li.javaconfig.asciipanel.AsciiPanel;
import li.javaconfig.asciipanel.AsciiFont;
import li.javaconfig.asciipanel.AsciiCharacterData;
import li.javaconfig.asciipanel.TileTransformer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfig {
    @Bean(name = "asciiPanel_8x8")
    public AsciiPanel asciiPanel_8x8() {
        AsciiPanel asciiPanel = new AsciiPanel();
        asciiPanel.setAsciiFont(AsciiFont.CP437_8x8);
        return asciiPanel;
    }

    @Bean(name="asciiPanel_9x16")
    public AsciiPanel asciiPanel_9x16(){
        AsciiPanel asciiPanel = new AsciiPanel();
        asciiPanel.setAsciiFont(AsciiFont.CP437_9x16);
        return asciiPanel;
    }
}
