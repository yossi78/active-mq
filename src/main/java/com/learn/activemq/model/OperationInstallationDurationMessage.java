package com.learn.activemq.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@
public class OperationInstallationDurationMessage implements Messagable{


    @NotNull
    private BigInteger id;
    private String deviceId;
    @NotNull
    private Date clientEventDate;
    private String domain;
    @NotEmpty
    private String errorCode;
    private String status;
    private String statusKey;
    private String statusDisplay;
    private String errorCodeDisplay;
    @NotEmpty
    private String additionalInfo;
    private String resultCode;
    @NotNull
    @JsonProperty("telemetryComponentVersionId")
    private BigInteger componentVersionId;

    @SneakyThrows
    @Override
    public String toJson() {
        return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
    }

}
