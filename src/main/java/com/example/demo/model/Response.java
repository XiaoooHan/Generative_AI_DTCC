package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@SuperBuilder
@JsonInclude(NON_NULL)
public class Response {
    protected LocalTime timestamp;
    protected int status;//1 for success, 0 for failure(Unmatching trade id, but saved anyway)
    protected String reason;
    protected String message;
    protected String developerMessage;

}
