package br.com.ms.springmail.dtos;

import lombok.Data;

import javax.persistence.Column;

@Data
public class EmailDto {

    private Long emailIdl;
    private String ownerRed;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
}
