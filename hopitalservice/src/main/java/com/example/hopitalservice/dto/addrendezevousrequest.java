package com.example.hopitalservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class addrendezevousrequest {

    private int  rendezpatient_id ;
    private int medcin_id  ;
    private LocalDateTime rendezevous_timestamp  ;

}
