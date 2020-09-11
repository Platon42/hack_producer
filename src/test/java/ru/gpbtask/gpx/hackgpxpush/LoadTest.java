package ru.gpbtask.gpx.hackgpxpush;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.gpbtask.gpx.hackgpxpush.dto.GpsSignalById;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadTest {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String s = null;
        GpsSignalById[] gpsData = null;
        try {
            s = Files.readString(Paths.get("./data/last_part.json"));
            gpsData = objectMapper.readValue(s, GpsSignalById[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(gpsData[100].getLongitude());
    }
}
