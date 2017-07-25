package com.psddev.dari.db;

class QueryPhraseBuilder {

    private String phrase;
    private int proximity;
    private double weight;

    public QueryPhraseBuilder phrase(String phrase) {
        this.phrase = phrase;
        return this;
    }

    public QueryPhraseBuilder proximity(int proximity) {
        this.proximity = proximity;
        return this;
    }

    public QueryPhraseBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public QueryPhrase build() {
        return new QueryPhrase(phrase, proximity, weight);
    }
}
