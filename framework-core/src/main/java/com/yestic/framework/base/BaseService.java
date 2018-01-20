package com.yestic.framework.base;

import java.io.Serializable;

public abstract class BaseService <M extends Serializable> {

    private BaseRepository<M> baseRepository;

    public void setRepository(BaseRepository<M> baseRepository) {
        this.baseRepository = baseRepository;
    }

}
