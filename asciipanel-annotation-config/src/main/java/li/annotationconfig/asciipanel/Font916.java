package li.annotationconfig.asciipanel;

import org.springframework.stereotype.Component;

@Component
public class Font916 extends AsciiFont {
    Font916(){
        super(AsciiFont.CP437_9x16.getFontFilename(), AsciiFont.CP437_9x16.getWidth(), AsciiFont.CP437_9x16.getHeight());
    }
}
