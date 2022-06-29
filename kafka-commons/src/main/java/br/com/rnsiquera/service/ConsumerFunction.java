package br.com.rnsiquera.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction<T> {
    void consumer(ConsumerRecord<String, T> record) throws Exception;
}
