package ru.gpbtask.gpx.hackgpxpush.dto;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
public class GpsSignalById {

    @JsonProperty("client_id")
    private Integer clientId;
    @JsonProperty("time")
    private String time;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("altitude (m)")
    private String altitudeM;
    @JsonProperty("speed (km/h)")
    private String speedKmH;
    @JsonProperty("course")
    private String course;
    @JsonProperty("sat")
    private Integer sat;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("client_id")
    public Integer getClientId() {
        return clientId;
    }

    @JsonProperty("client_id")
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("altitude (m)")
    public String getAltitudeM() {
        return altitudeM;
    }

    @JsonProperty("altitude (m)")
    public void setAltitudeM(String altitudeM) {
        this.altitudeM = altitudeM;
    }

    @JsonProperty("speed (km/h)")
    public String getSpeedKmH() {
        return speedKmH;
    }

    @JsonProperty("speed (km/h)")
    public void setSpeedKmH(String speedKmH) {
        this.speedKmH = speedKmH;
    }

    @JsonProperty("course")
    public String getCourse() {
        return course;
    }

    @JsonProperty("course")
    public void setCourse(String course) {
        this.course = course;
    }

    @JsonProperty("sat")
    public Integer getSat() {
        return sat;
    }

    @JsonProperty("sat")
    public void setSat(Integer sat) {
        this.sat = sat;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}