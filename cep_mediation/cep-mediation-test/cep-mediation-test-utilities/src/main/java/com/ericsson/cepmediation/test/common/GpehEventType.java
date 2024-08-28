/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.test.common;

public enum GpehEventType {
    /**
     * EventId assignments are based on definitions exist at
     * /cep-mediation-base/src/main/resources/xml/GPEH_BU-L10B_transformed.xml
     * file.
     * */

    RRC_RRC_CONNECTION_SETUP(35),

    RRC_RRC_CONNECTION_RELEASE_COMPLETE(20),

    INTERNAL_IMSI(384),

    INTERNAL_RAB_ESTABLISHMENT(415),

    INTERNAL_RAB_RELEASE(416),

    INTERNAL_SYSTEM_RELEASE(438),

    INTERNAL_NORMAL_RELEASE(457),

    RRC_MEASUREMENT_REPORT(8),

    INTERNAL_CHANNEL_SWITCHING(387),

    INTERNAL_SYSTEM_UTILIZATION(451),

    INTERNAL_FAILED_HSDSCH_CELL_CHANGE(433),

    INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE(432),

    INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED(436),

    INTERNAL_OUT_HARD_HANDOVER_FAILURE(458),

    INTERNAL_IFHO_EXECUTION_ACTIVE(423),

    INTERNAL_SOFT_HANDOVER_EXECUTION(408),

    INTERNAL_CMODE_ACTIVATE(401),

    INTERNAL_CMODE_DEACTIVATE(402),

    INTERNAL_START_CONGESTION(393),

    INTERNAL_STOP_CONGESTION(394),

    INTERNAL_RECORDING_FAULT(444),

    INTERNAL_RECORDING_RECOVERED(445),

    INTERNAL_MP_OVERLOAD(425),

    INTERNAL_CALL_SETUP_FAIL(456),

    INTERNAL_CALL_REESTABLISHMENT(409),

    INTERNAL_SOHO_DS_MISSING_NEIGHBOUR(427),

    RRC_UPLINK_DIRECT_TRANSFER(29),

    RANAP_IU_RELEASE_COMMAND(-2),

    NBAP_RADIO_LINK_SETUP_REQUEST(128),

    RANAP_RAB_ASSIGNMENT_REQUEST(256),

    RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST(512);

    private final int id;

    private GpehEventType(final int eventId) {
        id = eventId;
    }

    public int getId() {
        return id;
    }

    public static GpehEventType getEventType(final int eventId) {
        for (final GpehEventType gpehEvent : GpehEventType.values()) {
            if (gpehEvent.getId() == eventId) {
                return gpehEvent;
            }
        }
        throw new RuntimeException("No event type in for event id " + eventId);
    }

}
