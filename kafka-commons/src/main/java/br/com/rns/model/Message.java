package br.com.rns.model;

public class Message<T> {

    private final CorrelationId correlationId;
    private final T payload;

    public Message(CorrelationId correlationId, T payload) {

        this.correlationId = correlationId;
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "correlationId=" + correlationId +
                ", payload=" + payload +
                '}';
    }
}
