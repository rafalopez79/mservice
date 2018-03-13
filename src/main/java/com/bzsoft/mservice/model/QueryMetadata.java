package com.bzsoft.mservice.model;

//TODO: envolver en data los datos
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
