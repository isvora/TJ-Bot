package org.togetherjava.tjbot.commands.mathcommands.wolframalpha.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * See the Wolfram Alpha API.
 */
@JsonRootName("tip")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Tip {
    @JacksonXmlProperty(isAttribute = true)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
