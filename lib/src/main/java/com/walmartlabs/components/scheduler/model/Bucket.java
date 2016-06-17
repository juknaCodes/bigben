package com.walmartlabs.components.scheduler.model;

import com.walmart.gmp.ingestion.platform.framework.data.core.Entity;
import com.walmartlabs.components.scheduler.model.EventDO.EventKey;

import java.util.List;

/**
 * Created by smalik3 on 3/18/16
 */
public interface Bucket extends Entity<Long> {

    enum BucketStatus {PROCESSED, ERROR}

    String getStatus();

    void setStatus(String status);

    long getCount();

    void setCount(long count);

    void setFailedEvents(List<EventKey> failedEvents);

    List<EventKey> getFailedEvents();


}