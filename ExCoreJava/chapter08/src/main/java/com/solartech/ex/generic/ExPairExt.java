package com.solartech.ex.generic;

public class ExPairExt<T extends Comparable> {

private T first;

private T second;

public ExPairExt() {
        this.first = null;
        this.second = null;
        }

public ExPairExt(T oFirst, T oSecond) {
        this.first = oFirst;
        this.second = oSecond;
        }

public T getFirst() {
        return this.first;
        }

public T getSecond() {
        return this.second;
        }

public void setFirst(T oVar) {
        this.first = oVar;
        }

public void setSecond(T oVar) {
        this.second = oVar;
        }
}
