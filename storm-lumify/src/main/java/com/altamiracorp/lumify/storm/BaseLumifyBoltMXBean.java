package com.altamiracorp.lumify.storm;

import javax.management.MXBean;

@MXBean
public interface BaseLumifyBoltMXBean {
    public long getProcessingCount();

    public long getTotalProcessedCount();

    public long getTotalErrorCount();

    public long getAverageProcessingTime();
}
