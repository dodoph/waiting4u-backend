package edu.osu.waiting4ubackend.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.joda.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Entity for Pet class
 */
public class Pet {
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
    @JsonProperty("pet_id")
    private String id;
    @JsonProperty("pet_name")
    private String petName;
    private String type;
    private String breed;
    @JsonProperty("date_of_birth")
    private Date dateOfBirth;
    @JsonProperty("date_created")
    private Date dateCreated;
    private Date dateUpdated;
    private String availability = "Available";
    private List<String> status = Collections.singletonList(SDF.format(new Date()) + " A new pet joins us!");
    private String description;
    @JsonProperty("admin_id")
    private String adminId;
    private List<String> dispositions = new ArrayList<>();
    @JsonProperty("image_url")
    private String imageUrl = "";

    public Pet() {

    }

    private Pet(PetBuilder petBuilder) {
        this.id = petBuilder.id;
        this.petName = petBuilder.petName;
        this.type = petBuilder.type;
        this.breed = petBuilder.breed;
        this.dateOfBirth = petBuilder.dateOfBirth;
        this.dateCreated = petBuilder.dateCreated;
        this.dateUpdated = petBuilder.dateUpdated;
        this.availability = petBuilder.availability;
        this.status = petBuilder.status;
        this.description = petBuilder.description;
        this.adminId = petBuilder.adminId;
        this.dispositions = petBuilder.dispositions;
        this.imageUrl = petBuilder.imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getPetName() {
        return petName;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public Date getDateOfBirth() { return dateOfBirth; }

    public Date getDateCreated() { return  dateCreated; }

    public Date getDateUpdated() { return dateUpdated; }

    public String getAvailability() {
        return availability;
    }

    public List<String> getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getAdminId() { return  adminId; }

    public List<String> getDispositions() {

        return dispositions;
    }

    public void setAvailability(String s) {
        if(s.length() != 0) {
            availability = s;
        }
    }

    public void setStatus(List<String> list) {
        if(list == null || list.isEmpty()) {
            status = Collections.singletonList(SDF.format(new Date()) + " A new pet joins us!");
        } else {
            status = list;
        }
    }

    public void setDispositions(List<String> list) {
        if(list != null) {
            dispositions = list;
        }
    }

    public void setImageUrl(String s) {
        if(s != null) {
            imageUrl = s;
        }
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public static class PetBuilder {
        private String id;
        private String petName;
        private String type;
        private String breed;
        private Date dateOfBirth;
        private Date dateCreated;
        private Date dateUpdated;
        private String availability = "Available";
        private List<String> status = new ArrayList<>();
        private String description;
        private String adminId = "";
        private List<String> dispositions = new ArrayList<>();
        private String imageUrl = "";

        public PetBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PetBuilder setPetName(String petName) {
            this.petName = petName;
            return this;
        }

        public PetBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PetBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public PetBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PetBuilder setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public PetBuilder setDateUpdated(Date dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }

        public PetBuilder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public PetBuilder setStatus(List<String> status) {
            this.status = status;
            return this;
        }

        public PetBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public PetBuilder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public PetBuilder setDispositions(List<String> dispositions) {
            this.dispositions = dispositions;
            return this;
        }

        public PetBuilder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Pet build() {
            return new Pet(this);
        }
    }
}

