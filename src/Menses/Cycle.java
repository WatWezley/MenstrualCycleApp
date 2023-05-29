package Menses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cycle {

    private String dateOfLastMenses;
    private int menstrualCycleDays;
    private int noOfDaysOfFlow;
    private LocalDate startOfLastMenses;
    private int ovulationStart;
    private int firstFreePeriod;
    private int nextFreePeriod;
    private LocalDate nextMenstrualCycle;
    private List<String> freePeriods ;
    private List<LocalDate> ovulationDays;

    public void setFreePeriods() {
        this.freePeriods = new ArrayList<>();
    }

    public void setOvulationDays() {
        this.ovulationDays = new ArrayList<>();
    }

    public LocalDate getNextMenstrualCycle() {
        return nextMenstrualCycle;
    }


    public List<String> getFreePeriods() {
        return freePeriods;
    }

    public List<LocalDate> getOvulationDays() {
        return ovulationDays;
    }

    public String getDateOfLastMenses() {
        return dateOfLastMenses;
    }

    public int getMenstrualCycleDays() {
        return menstrualCycleDays;
    }

    public void setMenstrualCycleDays(int menstrualCycleDays) {
        this.menstrualCycleDays = menstrualCycleDays;
    }

    public void setNoOfDaysOfFlow(int noOfDaysOfFlow) {
        this.noOfDaysOfFlow = noOfDaysOfFlow;
    }

    public LocalDate getStartOfLastMenses() {
        return startOfLastMenses;
    }

    public void setStartOfLastMenses(String dateOfLastMenses) {
        startOfLastMenses = LocalDate.parse(dateOfLastMenses);
    }

    public void setOvulationStart(int menstrualCycleDays) {
        this.ovulationStart = (menstrualCycleDays / 2) - 1;
    }

    public void setFirstFreePeriod(int noOfDaysOfFlow) {
        this.firstFreePeriod = noOfDaysOfFlow ;
    }

    public void setNextFreePeriod() {
        this.nextFreePeriod = ovulationStart + 3;
    }

    public void findStartOfNextMenstrualCycle(LocalDate startOfLastMenses, int menstrualCycleDays) {
        nextMenstrualCycle = startOfLastMenses.plusDays(menstrualCycleDays);
    }

    public void findSafePeriods() {
        for (int y = firstFreePeriod; y < ovulationStart; y++) {
            LocalDate freeDay = startOfLastMenses.plusDays(y);
            String freeDays = freeDay.toString();
            freePeriods.add(freeDays);
        }
        for (int s = nextFreePeriod; s < menstrualCycleDays; s++) {
            LocalDate freeDay = startOfLastMenses.plusDays(s);
            String freeDays = freeDay.toString();
            freePeriods.add(freeDays);
        }
    }

    public void findOvationDate() {
        for (int r = ovulationStart; r <= (ovulationStart + 2); r++) {
            LocalDate ovulationPeriod = startOfLastMenses.plusDays(r);
            ovulationDays.add(ovulationPeriod);
        }
    }
}
