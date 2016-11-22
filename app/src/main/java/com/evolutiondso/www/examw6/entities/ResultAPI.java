package com.evolutiondso.www.examw6.entities;

/**
 * Created by Albrtx on 22/11/2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultAPI {

    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("info")
    @Expose
    private Info info;

    /**
     *
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     *
     * @return
     *     The info
     */
    public Info getInfo() {
        return info;
    }

    /**
     *
     * @param info
     *     The info
     */
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ResultAPI{" +
                "results=" + results +
                ", info=" + info +
                '}';
    }
}