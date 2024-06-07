package com.jagex.game.config.vartype;



public interface VarContainer extends Iterable {

    void setVarValueInt(int id, int value);

    Object getVarValue(int id);

    void setVarValue(int id, Object value);

    void clear();

    void method14734(int id);

    long getVarValueLong(int id);

    int getVarValueInt(int id);

    void setVarValueLong(int id, long value);
}
