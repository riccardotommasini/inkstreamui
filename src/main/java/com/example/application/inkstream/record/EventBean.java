package com.example.application.inkstream.record;

import java.util.List;

public interface EventBean<V> {
    public V getValue(String attributeName);
    public long getTime();
    public V getValue();
    public String getLabel();

    public EventBean<V> project(List<String> attributes);

}
