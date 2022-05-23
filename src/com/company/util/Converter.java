package com.company.util;

@FunctionalInterface
public interface Converter<T,N> {
    T convert (N el);

}
