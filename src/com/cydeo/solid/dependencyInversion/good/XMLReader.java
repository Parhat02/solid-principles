package com.cydeo.solid.dependencyInversion.good;

public class XMLReader implements Reader{
    @Override
    public String getUsername() {
        return "<username>mikesmith</username>";
    }
}
