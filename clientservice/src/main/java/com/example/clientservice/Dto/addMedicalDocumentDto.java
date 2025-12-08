package com.example.clientservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class addMedicalDocumentDto   {
    private String title;
    private String type;
    private String url;
    private LocalDateTime uploadDate;
}
