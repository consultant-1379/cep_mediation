package com.ericsson.cepmediation.profiling.valueobject;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.profiling.INTERVALS;
import com.ericsson.cepmediation.profiling.util.Utils;

public class CpuStatesData extends SystemData {
    private List<StateData> states = new ArrayList<StateData>();

    enum CPU_STATES {
        IDLE("I", 0, 10), LOW("L", 11, 30), MEDIUM("M", 31, 60), HIGH("H", 61, 90), CRITICAL("C", 91, 100);

        private String abbrev;

        private int from;

        private int to;

        CPU_STATES(String abbrev, int from, int to) {
            this.abbrev = abbrev;
            this.from = from;
            this.to = to;
        }

        public String getAbbrev() {
            return abbrev;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }

    public CpuStatesData(INTERVALS interval, long time) {
        super(interval, time);
        for (CPU_STATES state : CPU_STATES.values()) {
            states.add(new StateData(interval, state, time));
        }
    }

    @Override
    public void submit(Number d) {
        for (StateData sd : states) {
            sd.submit(d.doubleValue());
        }
    }

    @Override
    public String getData() {
        StringBuilder data = new StringBuilder();
        for (StateData sd : states) {
            data.append(sd.getData() + " ");
        }
        return data.toString();
    }

    @Override
    public SystemData nextInstance() {
        return new CpuStatesData(interval, interval.getMillis() + endTime);
    }

    @Override
    public int getComputedValue() {
        throw new UnsupportedOperationException("Computed value for CpuStatesData does not make sense.");
    }

    @Override
    public CpuStatesData add(SystemData other) {
        if (!(other instanceof CpuStatesData)) {
            throw new IllegalArgumentException();
        }

        if (this.interval != other.interval) {
            throw new IllegalArgumentException("Cannot add data for different intervals! This: " + interval + " Other: " + other.interval);
        }

        CpuStatesData otherData = (CpuStatesData) other;

        CpuStatesData res = (CpuStatesData) nextInstance();
        res.states = new ArrayList<CpuStatesData.StateData>();
        for (int i = 0; i < states.size(); i++) {
            StateData resData = (StateData) states.get(i).add(otherData.states.get(i));
            res.states.add(resData);

        }
        return res;
    }

    public static class StateData {
        private CPU_STATES state;

        private int percentage;

        private boolean isComputed;

        private int samples;
        
        private int total;
        
        private INTERVALS interval;
        
        private long time;
        StateData(INTERVALS interval, CPU_STATES state, long time) {
            this.state = state;
            this.time = time;
            this.interval = interval;
        }

        public void submit(double d) {
            if (state.getFrom() <= d && d < state.getTo()) {
                samples++;
            }
            
            total++;
        }

        public StateData add(StateData other) {
            StateData res = new StateData(interval, state, -1);
            res.samples = samples + other.samples;
            res.total = total + other.total;
            return res;
        }

        public int getComputedValue() {
            compute();
            return percentage;
        }

        private void compute() {
            if (!isComputed) {
                if (total > 0) {
                    percentage = Utils.calcPercentage((int) samples, total);
                }
                isComputed = true;
            }
        }

        public String getData() {
            compute();
            return state.getAbbrev() + ":" + percentage;
        }

        public StateData nextInstance() {
            return new StateData(interval, state, interval.getMillis() + time);
        }
    }

    @Override
    public String toString() {
        return "CpuStatesData [states=" + states + ", time=" + endTime + ", total=" + total + ", cnt=" + cnt + ", interval=" + interval + "]";
    }

}
