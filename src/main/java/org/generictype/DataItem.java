package org.generictype;

import javax.json.bind.annotation.JsonbProperty;

import lombok.Data;

@Data
public class DataItem<T> {
    @JsonbProperty("content")
    private T content;

//    @JsonbCreator
//    public DataItem(@JsonbProperty("content") T content) {
//        this.content = content;
//    }
}
