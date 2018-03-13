package com.bzsoft.mservice.model;


public class QueryMetadata {

    private final String[] columns;
    private final int[] types;
    private final boolean[] nullable;
    
    public QueryMetadata(String[] columns, int[] types, boolean[] nullable) {       
        this.columns = columns;
        this.types = types;
        this.nullable = nullable;
    }
    
    public String[] getColumns() {
        return this.columns;
    }
    
    public int[] getTypes() {
        return this.types;
    }
    
    public boolean[] getNullable() {
        return this.nullable;
    }
    
    
    

}
