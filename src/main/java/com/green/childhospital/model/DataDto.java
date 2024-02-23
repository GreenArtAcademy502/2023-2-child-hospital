package com.green.childhospital.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DataDto {
    @Schema(example = "1")
    private int page;
    @Schema(example = "100")
    private int size;
    @Schema(example = "안양시")
    private String sigunNm;
}
