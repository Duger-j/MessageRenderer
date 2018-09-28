package MessageRendering.Interfaces;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider provider);
    void render();
}
