package com.example.rendondev.firsthomework.Response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class response{

    @SerializedName("hex")
    @Expose
    private Hex hex;

    public response() {
    }

    public response(Hex hex) {
        this.hex = hex;
    }

    public Hex getHex() {
        return hex;
    }

    public void setHex(Hex hex) {
        this.hex = hex;
    }

    class Hex implements Serializable
    {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("clean")
        @Expose
        private String clean;
        private final static long serialVersionUID = 2723539926615531994L;

        /**
         * No args constructor for use in serialization
         *
         */
        public Hex() {
        }

        /**
         *
         * @param clean
         * @param value
         */
        public Hex(String value, String clean) {
            super();
            this.value = value;
            this.clean = clean;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getClean() {
            return clean;
        }

        public void setClean(String clean) {
            this.clean = clean;
        }
    }
}

