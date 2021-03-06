package com.pixable.pixalytics.core;

import java.util.HashMap;
import java.util.Map;

/**
 * An Screen that is to be tracked, that has a name and a set of properties (key-value pairs).
 */
public class Screen extends KeyValueMap {

    /**
     * Use the {@link Screen.Builder}.
     *
     * @param screenName
     * @param properties
     */
    private Screen(String screenName, Map<String, Object> properties) {
        super(screenName, properties);
    }

    public static class Builder {
        private String name = null;
        private final Map<String, Object> properties = new HashMap<>();

        /**
         * Sets the name of the Screen object. This parameter is compulsory.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Adds a property. Add as many properties (key-value pairs) as you wish.
         */
        public Builder property(String name, String value) {
            properties.put(name, value);
            return this;
        }

        /**
         * Adds multiple properties at once.
         */
        public Builder properties(Map<String, Object> properties) {
            properties.putAll(properties);
            return this;
        }

        public Screen build() {
            if (name == null) {
                throw new IllegalStateException("No name was provided for this screen");
            } else {
                return new Screen(name, properties);
            }
        }
    }
}
