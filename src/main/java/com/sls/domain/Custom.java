package com.sls.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author sls
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "custom")
public class Custom {

    @Id
    private Integer customId;

    @Field("custom_name")
    private String customName;
}
