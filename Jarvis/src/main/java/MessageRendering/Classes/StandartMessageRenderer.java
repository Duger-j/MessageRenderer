package MessageRendering.Classes;

import MessageRendering.Interfaces.MessageProvider;
import MessageRendering.Interfaces.MessageRenderer;
import PrefixCreation.Interfaces.PrefixProvider;
import TextColoring.Interfaces.ColorProvider;

public class StandartMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;
    private ColorProvider colorProvider;
    private PrefixProvider prefixProvider;

    public void setPrefixProvider(PrefixProvider prefixProvider) {
        this.prefixProvider = prefixProvider;
    }

    public void setColorProvider(ColorProvider colorProvider) {
        this.colorProvider = colorProvider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public void render() {
        System.out.println(this.messageProvider.getMessage());
    }
}
