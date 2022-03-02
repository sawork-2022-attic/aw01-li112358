package li.annotationconfig.asciipanel;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Font88 extends AsciiFont {
    Font88(){
        super(AsciiFont.CP437_8x8.getFontFilename(),AsciiFont.CP437_8x8.getWidth(), AsciiFont.CP437_8x8.getHeight());
    }
}
