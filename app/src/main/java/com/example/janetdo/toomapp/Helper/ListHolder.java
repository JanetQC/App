package com.example.janetdo.toomapp.Helper;

import java.io.Serializable;
import java.util.List;

/**
 * Created by janetdo on 11.01.18.
 */

public class ListHolder implements Serializable {
    private List<Incident> incidentList;
    private List<Problem> problemList;
    private List<Item> itemList;

    public ListHolder(List<Incident> incidentList) {
        this.incidentList = incidentList;
    }

    public ListHolder() {

    }
    public void initProblemList(List<Problem> problemList) {

        this.problemList = problemList;
    }

    public void initIncidentList(List<Incident> incidentList) {

        this.incidentList = incidentList;
    }

    public void initItemList(List<Item> itemList) {

        this.itemList = itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public List<Problem> getProblemList() {
        return problemList;
    }

    public List<Incident> getIncidentList() {
        return incidentList;
    }

    @Override
    public String toString() {
        return "ListHolder{" +
                "incidentList=" + incidentList +
                ", problemList=" + problemList +
                '}';
    }
}
