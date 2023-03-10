package org.brianlobo.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Example {

    private String str;
    private Date date;
    private Double doubleVar;
    private Integer integer;
}
