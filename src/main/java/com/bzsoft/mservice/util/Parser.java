package com.bzsoft.mservice.util;

import java.io.InputStream;
import java.util.Map;

import com.bzsoft.mservice.model.Query;


public interface Parser {
      
    public Map<String, Query>  parse(InputStream is) throws Exception;
    
}
