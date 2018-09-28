package MessageRendering.Classes;

import MessageRendering.Interfaces.MessageProvider;
import MessageRendering.Interfaces.MessageRenderer;

public class StandartMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    public MessageProvider getMessageProvider() {
        return this.provider;
    }

    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(this.provider.getMessage());
    }
}
