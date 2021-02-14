package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "OPTIMIZER_TRACE")
public class OptimizerTrace {
    @Column(name = "QUERY")
    private String query;

    @Column(name = "TRACE")
    private String trace;

    @Column(name = "MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    private Integer missingBytesBeyondMaxMemSize;

    @Column(name = "INSUFFICIENT_PRIVILEGES")
    private Boolean insufficientPrivileges;

    /**
     * @return QUERY
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return TRACE
     */
    public String getTrace() {
        return trace;
    }

    /**
     * @param trace
     */
    public void setTrace(String trace) {
        this.trace = trace;
    }

    /**
     * @return MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     */
    public Integer getMissingBytesBeyondMaxMemSize() {
        return missingBytesBeyondMaxMemSize;
    }

    /**
     * @param missingBytesBeyondMaxMemSize
     */
    public void setMissingBytesBeyondMaxMemSize(Integer missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    /**
     * @return INSUFFICIENT_PRIVILEGES
     */
    public Boolean getInsufficientPrivileges() {
        return insufficientPrivileges;
    }

    /**
     * @param insufficientPrivileges
     */
    public void setInsufficientPrivileges(Boolean insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }
}