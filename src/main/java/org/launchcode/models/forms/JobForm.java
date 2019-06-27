package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, max=25)
    private String name;

    @NotNull(message = "Must select option from drop down menu")
    private int employerId;

    @NotNull
    private int locationId;

    @NotNull
    private int coreCompetencyId;

    @NotNull
    private int positionTypeId;

    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */

    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */

        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();

    }

    public Employer getEmployerName(int id){
        for(Employer employer : employers){
            if(id == employer.getId()){
                return employer;
            }
        }

        return null;
    }

    public Location getLocationName(int id){
        for(Location location : locations){
            if(id == location.getId()){
                return location;
            }
        }

        return null;
    }

    public PositionType getPositionName(int id){
        for(PositionType position : positionTypes){
            if(id == position.getId()){
                return position;
            }
        }

        return null;
    }

    public CoreCompetency getSkillName(int id){
        for(CoreCompetency skill :  coreCompetencies){
            if(id == skill.getId()){
                return skill;
            }
        }

        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ID getter and setters

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }

    public void setCoreCompetencyId(int coreCompetencyId) {
        this.coreCompetencyId = coreCompetencyId;
    }

    public int getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(int positionTypeId) {
        this.positionTypeId = positionTypeId;
    }


    //arrayList getters and setters

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}
