package ru.gpbtask.gpx.hackgpxpush.dto;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "client_id",
        "time",
        "latitude",
        "longitude",
        "altitude (m)",
        "speed (km/h)",
        "course",
        "sat",
        "name"
})
@ToString
@Data
public class GpsSignalById {

    @JsonProperty("client_id")
    private Integer clientId;
    @JsonProperty("time")
    private String time;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("altitude (m)")
    private Double altitudeM;
    @JsonProperty("speed (km/h)")
    private Double speedKmH;
    @JsonProperty("course")
    private Double course;
    @JsonProperty("sat")
    private Integer sat;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}