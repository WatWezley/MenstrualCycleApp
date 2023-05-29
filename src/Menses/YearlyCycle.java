package Menses;

import java.time.LocalDate;
import java.util.ArrayList;

public class YearlyCycle {

    Cycle cycle = new Cycle();

    public void calculateYearlyMenstrualCycle(String startOfLastMenses, int menstrualCycleDays, int numberOfFlow){
        cycle.setStartOfLastMenses(startOfLastMenses);
        cycle.setMenstrualCycleDays(menstrualCycleDays);
        cycle.setNoOfDaysOfFlow(numberOfFlow);
        cycle.setFirstFreePeriod(numberOfFlow);
        cycle.setOvulationStart(menstrualCycleDays);
        cycle.setNextFreePeriod();
        for(int x = 1; x <= 12; x++){
            cycle.setFreePeriods();
            cycle.setOvulationDays();
            cycle.findStartOfNextMenstrualCycle(cycle.getStartOfLastMenses(),cycle.getMenstrualCycleDays());
            cycle.findSafePeriods();
            cycle.findOvationDate();
            System.out.println("your last menstrual cycle started "+ cycle.getStartOfLastMenses());
            System.out.println("your next menstrual cycle start on "+ cycle.getNextMenstrualCycle());
            System.out.println( "the following days are your free periods :"+ cycle.getFreePeriods());
            System.out.println("your ovulation days are :"+ cycle.getOvulationDays());
            System.out.println();
            System.out.println();
            String menses = cycle.getNextMenstrualCycle().toString();
            cycle.setStartOfLastMenses(menses);
        }
    }
}
