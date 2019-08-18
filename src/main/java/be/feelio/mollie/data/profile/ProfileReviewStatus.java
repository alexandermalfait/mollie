package be.feelio.mollie.data.profile;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  ProfileReviewStatus {

    PENDING,
    REJECTED;

    @JsonValue
    public String getJsonValue() {
        return this.name().toLowerCase();
    }
}
