package com.green.childhospital;

import com.green.childhospital.model.DataDto;
import com.green.childhospital.model.DataVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("api")
@RestController
public class ApiController {
    private final ApiService service;

    @GetMapping("data")
    public List<DataVo> getData(DataDto dto) {
        return service.getData(dto);
    }
}
