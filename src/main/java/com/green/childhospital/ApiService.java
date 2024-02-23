package com.green.childhospital;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.childhospital.common.OpenApiProperties;
import com.green.childhospital.model.DataDto;
import com.green.childhospital.model.DataVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ApiService {
    private final OpenApiProperties openApiProperties;

    public List<DataVo> getData(DataDto dto) {

        DefaultUriBuilderFactory factory =
                new DefaultUriBuilderFactory(openApiProperties.getChildHospital().getBaseUrl());

        WebClient webClient = WebClient.builder()
                .uriBuilderFactory(factory)
                .baseUrl(openApiProperties.getChildHospital().getBaseUrl())
                .build();

        String json = webClient.get().uri(uriBuilder -> uriBuilder.path(openApiProperties.getChildHospital().getDataUrl())
                .queryParam("Type", "json")
                .queryParam("Key", openApiProperties.getChildHospital().getServiceKey())
                .queryParam("pIndex", dto.getPage())
                .queryParam("pSize", dto.getSize())
                .queryParam("SIGUN_NM", dto.getSigunNm())
                .build()
        )
        .retrieve()
        .bodyToMono(String.class)
        .block();

        ObjectMapper om = new ObjectMapper()
                            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
                                    , false);
        try {
            JsonNode jsonNode = om.readTree(json);
//            List<DataVo> dataList = om.convertValue(jsonNode.at("/TbChildnatnPrvntncltnmdnstM/1/row")
//                    , new TypeReference<List<DataVo>>() {});

            List<DataVo> dataList = om.convertValue(jsonNode.path("TbChildnatnPrvntncltnmdnstM")
                            .path(1)
                            .path("row")
                    , new TypeReference<List<DataVo>>() {});
            log.info("dataList: {}", dataList);
            return dataList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
