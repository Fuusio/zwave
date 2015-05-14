package com.oberasoftware.home.zwave.api.messages.types;

/**
 * @author renarj
 */
public enum CommandClass {
    NO_OPERATION(0x00, "NO_OPERATION"),
    BASIC(0x20, "BASIC"),
    CONTROLLER_REPLICATION(0x21, "CONTROLLER_REPLICATION"),
    APPLICATION_STATUS(0x22, "APPLICATION_STATUS"),
    ZIP_SERVICES(0x23, "ZIP_SERVICES"),
    ZIP_SERVER(0x24, "ZIP_SERVER"),
    SWITCH_BINARY(0x25, "SWITCH_BINARY", true, 0),
    SWITCH_MULTILEVEL(0x26, "SWITCH_MULTILEVEL", true, 0),
    SWITCH_ALL(0x27, "SWITCH_ALL"),
    SWITCH_TOGGLE_BINARY(0x28, "SWITCH_TOGGLE_BINARY"),
    SWITCH_TOGGLE_MULTILEVEL(0x29, "SWITCH_TOGGLE_MULTILEVEL"),
    CHIMNEY_FAN(0x2A, "CHIMNEY_FAN"),
    SCENE_ACTIVATION(0x2B, "SCENE_ACTIVATION"),
    SCENE_ACTUATOR_CONF(0x2C, "SCENE_ACTUATOR_CONF"),
    SCENE_CONTROLLER_CONF(0x2D, "SCENE_CONTROLLER_CONF"),
    ZIP_CLIENT(0x2E, "ZIP_CLIENT"),
    ZIP_ADV_SERVICES(0x2F, "ZIP_ADV_SERVICES"),
    SENSOR_BINARY(0x30, "SENSOR_BINARY"),
    SENSOR_MULTILEVEL(0x31, "SENSOR_MULTILEVEL"),
    METER(0x32, "METER", true, 60),
    ZIP_ADV_SERVER(0x33, "ZIP_ADV_SERVER"),
    ZIP_ADV_CLIENT(0x34, "ZIP_ADV_CLIENT"),
    METER_PULSE(0x35, "METER_PULSE"),
    METER_TBL_CONFIG(0x3C, "METER_TBL_CONFIG"),
    METER_TBL_MONITOR(0x3D, "METER_TBL_MONITOR"),
    METER_TBL_PUSH(0x3E, "METER_TBL_PUSH"),
    THERMOSTAT_HEATING(0x38, "THERMOSTAT_HEATING"),
    THERMOSTAT_MODE(0x40, "THERMOSTAT_MODE"),
    THERMOSTAT_OPERATING_STATE(0x42, "THERMOSTAT_OPERATING_STATE"),
    THERMOSTAT_SETPOINT(0x43, "THERMOSTAT_SETPOINT"),
    THERMOSTAT_FAN_MODE(0x44, "THERMOSTAT_FAN_MODE"),
    THERMOSTAT_FAN_STATE(0x45, "THERMOSTAT_FAN_STATE"),
    CLIMATE_CONTROL_SCHEDULE(0x46, "CLIMATE_CONTROL_SCHEDULE"),
    THERMOSTAT_SETBACK(0x47, "THERMOSTAT_SETBACK"),
    DOOR_LOCK_LOGGING(0x4C, "DOOR_LOCK_LOGGING"),
    SCHEDULE_ENTRY_LOCK(0x4E, "SCHEDULE_ENTRY_LOCK"),
    BASIC_WINDOW_COVERING(0x50, "BASIC_WINDOW_COVERING"),
    MTP_WINDOW_COVERING(0x51, "MTP_WINDOW_COVERING"),
    MULTI_INSTANCE(0x60, "MULTI_INSTANCE"),
    DOOR_LOCK(0x62, "DOOR_LOCK"),
    USER_CODE(0x63, "USER_CODE"),
    CONFIGURATION(0x70, "CONFIGURATION"),
    ALARM(0x71, "ALARM"),
    MANUFACTURER_SPECIFIC(0x72, "MANUFACTURER_SPECIFIC"),
    POWERLEVEL(0x73, "POWERLEVEL"),
    PROTECTION(0x75, "PROTECTION"),
    LOCK(0x76, "LOCK"),
    NODE_NAMING(0x77, "NODE_NAMING"),
    FIRMWARE_UPDATE_MD(0x7A, "FIRMWARE_UPDATE_MD"),
    GROUPING_NAME(0x7B, "GROUPING_NAME"),
    REMOTE_ASSOCIATION_ACTIVATE(0x7C, "REMOTE_ASSOCIATION_ACTIVATE"),
    REMOTE_ASSOCIATION(0x7D, "REMOTE_ASSOCIATION"),
    BATTERY(0x80, "BATTERY"),
    CLOCK(0x81, "CLOCK"),
    HAIL(0x82, "HAIL"),
    WAKE_UP(0x84, "WAKE_UP"),
    ASSOCIATION(0x85, "ASSOCIATION"),
    VERSION(0x86, "VERSION"),
    INDICATOR(0x87, "INDICATOR"),
    PROPRIETARY(0x88, "PROPRIETARY"),
    LANGUAGE(0x89, "LANGUAGE"),
    TIME(0x8A, "TIME"),
    TIME_PARAMETERS(0x8B, "TIME_PARAMETERS"),
    GEOGRAPHIC_LOCATION(0x8C, "GEOGRAPHIC_LOCATION"),
    COMPOSITE(0x8D, "COMPOSITE"),
    MULTI_INSTANCE_ASSOCIATION(0x8E, "MULTI_INSTANCE_ASSOCIATION"),
    MULTI_CMD(0x8F, "MULTI_CMD"),
    ENERGY_PRODUCTION(0x90, "ENERGY_PRODUCTION"),
    MANUFACTURER_PROPRIETARY(0x91, "MANUFACTURER_PROPRIETARY"),
    SCREEN_MD(0x92, "SCREEN_MD"),
    SCREEN_ATTRIBUTES(0x93, "SCREEN_ATTRIBUTES"),
    SIMPLE_AV_CONTROL(0x94, "SIMPLE_AV_CONTROL"),
    AV_CONTENT_DIRECTORY_MD(0x95, "AV_CONTENT_DIRECTORY_MD"),
    AV_RENDERER_STATUS(0x96, "AV_RENDERER_STATUS"),
    AV_CONTENT_SEARCH_MD(0x97, "AV_CONTENT_SEARCH_MD"),
    SECURITY(0x98, "SECURITY"),
    AV_TAGGING_MD(0x99, "AV_TAGGING_MD"),
    IP_CONFIGURATION(0x9A, "IP_CONFIGURATION"),
    ASSOCIATION_COMMAND_CONFIGURATION(0x9B, "ASSOCIATION_COMMAND_CONFIGURATION"),
    SENSOR_ALARM(0x9C, "SENSOR_ALARM"),
    SILENCE_ALARM(0x9D, "SILENCE_ALARM"),
    SENSOR_CONFIGURATION(0x9E, "SENSOR_CONFIGURATION"),
    MARK(0xEF, "MARK"),
    NON_INTEROPERABLE(0xF0, "NON_INTEROPERABLE"),
    ALL(-1, null);

    private final int classCode;
    private final String label;
    private final int secondsRefreshInterval;
    private final boolean supportsPolling;

    CommandClass(int classCode, String label) {
        this(classCode, label, false, 0);
    }

    CommandClass(int classCode, String label, boolean supportsPolling, int secondsRefreshInterval) {
        this.classCode = classCode;
        this.supportsPolling = supportsPolling;
        this.secondsRefreshInterval = secondsRefreshInterval;
        this.label = label;
    }

    public boolean isPollingSupported() {
        return supportsPolling;
    }

    public int getClassCode() {
        return classCode;
    }

    public String getLabel() {
        return label;
    }

    public int getSecondsRefreshInterval() {
        return secondsRefreshInterval;
    }
}
