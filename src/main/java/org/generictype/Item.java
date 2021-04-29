package org.generictype;

import javax.json.bind.annotation.JsonbProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
    @JsonbProperty("name")
    private String name;
    @JsonbProperty("email")
    private String email;
}
