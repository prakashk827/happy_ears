package com.happy.ears.impala.hotels.dto;

import java.util.List;

public class HotelInfoDTO {

    private String hotelId;
    private String name;
    private String currency;
    private String starRating;
    private HotelDescription description;
    private List<String> phoneNumbers;
    private Boolean contractable;
    private List<String> emails;
    private String websiteUrl;
    private List<HotelImages> images;
    private HotelAddress address;
    private HotelLocation location;
    private String timezone;
    private List<HotelAmenities> amenities;
    private Integer roomCount;
    private HotelCheckIn checkIn;
    private HotelCheckOut checkOut;
    private String termsAndConditions;
    private String createdAt;
    private String updatedAt;
    private List<String> externalUrls;
    private List<HotelRoomType> roomTypes;


    //Getters and setters
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public HotelDescription getDescription() {
        return description;
    }

    public void setDescription(HotelDescription description) {
        this.description = description;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Boolean getContractable() {
        return contractable;
    }

    public void setContractable(Boolean contractable) {
        this.contractable = contractable;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public List<HotelImages> getImages() {
        return images;
    }

    public void setImages(List<HotelImages> images) {
        this.images = images;
    }

    public HotelAddress getAddress() {
        return address;
    }

    public void setAddress(HotelAddress address) {
        this.address = address;
    }

    public HotelLocation getLocation() {
        return location;
    }

    public void setLocation(HotelLocation location) {
        this.location = location;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<HotelAmenities> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<HotelAmenities> amenities) {
        this.amenities = amenities;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public HotelCheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(HotelCheckIn checkIn) {
        this.checkIn = checkIn;
    }

    public HotelCheckOut getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(HotelCheckOut checkOut) {
        this.checkOut = checkOut;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(List<String> externalUrls) {
        this.externalUrls = externalUrls;
    }

    public List<HotelRoomType> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<HotelRoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    @Override
    public String toString() {
        return "HotelBasicInfoDto{" +
                "hotelId='" + hotelId + '\'' +
                ", name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", starRating='" + starRating + '\'' +
                ", description=" + description +
                ", phoneNumbers=" + phoneNumbers +
                ", contractable=" + contractable +
                ", emails=" + emails +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", images=" + images +
                ", address=" + address +
                ", location=" + location +
                ", timezone='" + timezone + '\'' +
                ", amenities=" + amenities +
                ", roomCount=" + roomCount +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", termsAndConditions='" + termsAndConditions + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", externalUrls=" + externalUrls +
                ", roomTypes=" + roomTypes +
                '}';
    }
}
