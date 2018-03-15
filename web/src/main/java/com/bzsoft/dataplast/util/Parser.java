package com.bzsoft.dataplast.util;

import java.io.InputStream;
import java.util.Map;

import com.bzsoft.dataplast.model.QueryDefinition;

public interface Parser {

	public Map<String, QueryDefinition> parse(InputStream is) throws Exception;

}
