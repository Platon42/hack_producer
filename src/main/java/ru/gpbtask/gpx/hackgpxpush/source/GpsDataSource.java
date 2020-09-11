package ru.gpbtask.gpx.hackgpxpush.source;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ru.gpbtask.gpx.hackgpxpush.dto.GpsSignalById;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

@Service
@Slf4j
public class GpsDataSource {

    @Autowired
    private ObjectMapper objectMapper;

    public static final ArrayList<GpsSignalById> gpsSignalByIds = new ArrayList<>();

    public void setGpsDataSource() {
        GpsSignalById[] gpsData = null;
        String s;
        try {
            s = Files.readString(Paths.get("./data/last_part.json"));
            gpsData = objectMapper.readValue(s, GpsSignalById[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (gpsData != null) {
            gpsSignalByIds.addAll(Arrays.asList(gpsData));
        } else {
            log.error("not found general data!");
        }
    }
}
