/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.cepmediation.base.database.entity;

public class HashId {

    private final long hier3Id;

    private final long hier321Id;

    private final long hier3cellId;

    private final String cellId;

    private final Integer plmnId;

    private final int lac;

    private final byte rat;

    private final short rac;

    public HashId(final long hier3Id, final long hier321Id, final long hier3cellId, final String cellId,
            final Integer plmnId, final int lac, final byte rat, final short rac) {
        this.hier3Id = hier3Id;
        this.hier321Id = hier321Id;
        this.hier3cellId = hier3cellId;
        this.cellId = cellId;
        this.plmnId = plmnId;
        this.lac = lac;
        this.rat = rat;
        this.rac = rac;
    }

    public long getHier3Id() {
        return hier3Id;
    }

    public long getHier321Id() {
        return hier321Id;
    }

    public long getHier3cellId() {
        return hier3cellId;
    }

    public String getCellId() {
        return cellId;
    }

    public Integer getPlmnId() {
        return plmnId;
    }

    public int getLac() {
        return lac;
    }

    @Override
    public String toString() {
        return "HashId [hier3Id=" + hier3Id + ", hier321Id=" + hier321Id + ", hier3cellId=" + hier3cellId + ", cellId="
                + cellId + ", plmnId=" + plmnId + ", lac=" + lac + ", rac=" + rac + "]";
    }

    public byte getRat() {
        return rat;
    }

    public short getRac() {
        return rac;
    }
}
