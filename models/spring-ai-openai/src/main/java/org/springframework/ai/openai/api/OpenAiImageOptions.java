package org.springframework.ai.openai.api;

import org.springframework.ai.image.ImageOptions;

public interface OpenAiImageOptions extends ImageOptions {

	String getQuality();

	String getStyle();

	String getUser();

}
