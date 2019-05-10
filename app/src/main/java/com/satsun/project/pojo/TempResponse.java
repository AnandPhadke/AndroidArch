package com.satsun.project.pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"aa",
"cc",
"bb"
})
public class TempResponse {

@JsonProperty("aa")
private String aa;
@JsonProperty("cc")
private String cc;
@JsonProperty("bb")
private String bb;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<>();

@JsonProperty("aa")
public String getAa() {
return aa;
}

@JsonProperty("aa")
public void setAa(String aa) {
this.aa = aa;
}

@JsonProperty("cc")
public String getCc() {
return cc;
}

@JsonProperty("cc")
public void setCc(String cc) {
this.cc = cc;
}

@JsonProperty("bb")
public String getBb() {
return bb;
}

@JsonProperty("bb")
public void setBb(String bb) {
this.bb = bb;
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