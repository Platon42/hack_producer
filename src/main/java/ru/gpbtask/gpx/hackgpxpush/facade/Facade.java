package ru.gpbtask.gpx.hackgpxpush.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gpbtask.gpx.hackgpxpush.produce.KfkProducer;
import ru.gpbtask.gpx.hackgpxpush.source.GpsDataSource;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Slf4j
public class Facade {

    @Autowired
    private GpsDataSource gpsDataSource;

    @Autowired
    private KfkProducer producer;

    @Autowired
    private ObjectMapper objectMapper;
    @PostConstruct
    public void prepareAndRun() throws InterruptedException {
        gpsDataSource.setGpsDataSource();
        AtomicReference<String> json = new AtomicReference<>();
            while (true) {
                GpsDataSource.gpsSignalByIds.forEach(gpsSignalById -> {
                    try {
                        Thread.sleep(7000);
                        json.set(objectMapper.writeValueAsString(gpsSignalById));
                        producer.sendMessageWithCallback(json.get(), "input1");
                        producer.sendMessageWithCallback(json.get(), "input2");
                        producer.sendMessageWithCallback(json.get(), "input3");
                        producer.sendMessageWithCallback(json.get(), "input4");
                        producer.sendMessageWithCallback(json.get(), "input5");
                        producer.sendMessageWithCallback(json.get(), "input6");
                        producer.sendMessageWithCallback(json.get(), "input7");
                        producer.sendMessageWithCallback(json.get(), "input8");
                        producer.sendMessageWithCallback(json.get(), "input9");
                        producer.sendMessageWithCallback(json.get(), "input10");
                        producer.sendMessageWithCallback(json.get(), "input11");
                        producer.sendMessageWithCallback(json.get(), "input12");
                        producer.sendMessageWithCallback(json.get(), "input13");
                        producer.sendMessageWithCallback(json.get(), "input14");
                        producer.sendMessageWithCallback(json.get(), "input15");
                        producer.sendMessageWithCallback(json.get(), "input16");
                        producer.sendMessageWithCallback(json.get(), "input17");
                        producer.sendMessageWithCallback(json.get(), "input18");

                    } catch (JsonProcessingException | InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
    }
}
