package com.bzsoft.mservice.util;

import java.io.InputStream;
import java.util.Map;

import com.bzsoft.mservice.model.QueryDefinition;

public interface Parser {

	public Map<String, QueryDefinition> parse(InputStream is) throws Exception;

}
