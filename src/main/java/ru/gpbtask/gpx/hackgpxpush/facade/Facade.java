package ru.gpbtask.gpx.hackgpxpush.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gpbtask.gpx.hackgpxpush.dto.GpsSignalById;
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
    public void prepareAndRun() throws InterruptedException, JsonProcessingException {
        gpsDataSource.setGpsDataSource();
        while (true) {
            for (GpsSignalById signal : GpsDataSource.gpsSignalByIds) {
                String signalString = objectMapper.writeValueAsString(signal);
                Thread.sleep(10);
                producer.sendMessageWithCallback(signalString, "input1");
                producer.sendMessageWithCallback(signalString, "input2");
                producer.sendMessageWithCallback(signalString, "input3");
                producer.sendMessageWithCallback(signalString, "input4");
                producer.sendMessageWithCallback(signalString, "input5");
                producer.sendMessageWithCallback(signalString, "input6");
                producer.sendMessageWithCallback(signalString, "input7");
                producer.sendMessageWithCallback(signalString, "input8");
                producer.sendMessageWithCallback(signalString, "input9");
                producer.sendMessageWithCallback(signalString, "input10");
                producer.sendMessageWithCallback(signalString, "input11");
                producer.sendMessageWithCallback(signalString, "input12");
                producer.sendMessageWithCallback(signalString, "input13");
                producer.sendMessageWithCallback(signalString, "input14");
                producer.sendMessageWithCallback(signalString, "input15");
                producer.sendMessageWithCallback(signalString, "input16");
                producer.sendMessageWithCallback(signalString, "input17");
                producer.sendMessageWithCallback(signalString, "input18");
                producer.sendMessageWithCallback(signalString, "input19");
                producer.sendMessageWithCallback(signalString, "input20");
                producer.sendMessageWithCallback(signalString, "input21");
                producer.sendMessageWithCallback(signalString, "input22");
                producer.sendMessageWithCallback(signalString, "input23");
                producer.sendMessageWithCallback(signalString, "input24");
                producer.sendMessageWithCallback(signalString, "input25");
            }
        }
    }
}
