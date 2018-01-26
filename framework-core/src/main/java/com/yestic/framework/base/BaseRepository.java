package com.yestic.framework.base;

import java.io.Serializable;

public abstract class BaseRepository <M extends Serializable>{

    private BaseEntity baseEntity;

    public void setBaseEntity(BaseEntity baseEntity) {
        this.baseEntity = baseEntity;
    }
}
