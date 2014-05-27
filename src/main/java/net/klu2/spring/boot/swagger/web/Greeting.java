package net.klu2.spring.boot.swagger.web;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@ApiModel(value = "Encapsulates one greeting")
public class Greeting {
    @ApiModelProperty(required = true, notes = "The number of calls so far")
    private final long id;
    @ApiModelProperty(required = true, notes = "The response message")
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
