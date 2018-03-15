package com.bzsoft.dataplast.util.impl;

import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.bzsoft.dataplast.model.QueryDefinition;
import com.bzsoft.dataplast.util.Parser;


public class ParserImpl implements Parser{

    private static final String QUERIES ="queries";
    
    public ParserImpl() {
        
    }

    
    public Map<String, QueryDefinition> parse(InputStream is) throws Exception{
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(is);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName(QUERIES);
        return null;
    }

}
