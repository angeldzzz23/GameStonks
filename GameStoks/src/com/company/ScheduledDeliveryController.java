package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;


// this is in charge of scheduling deliveries
public class ScheduledDeliveryController {
    private String validDate;

    // scheduled delivery
    ScheduledDeliveryController() {
        DateView dateview = new DateView();
        dateview.title();
        validDate = getValidDate();
    }

    // returnn
    String getDate() {
        return validDate;
    }



    // gets a valiv date from the user
    private String getValidDate() {
        ScheduleInput input = new ScheduleInput();
        String inp = "";
        DateView dateview = new DateView();
        do {
            dateview.enterDateDisplay();
            inp = input.getInput();
            try {
                SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");
                Date date1=formatter1.parse(inp);
                System.out.println(date1);

                Date date = new Date();
                if (date1.before(date)) {
                    dateview.dateIsBeforeTodayError();
                    continue;
                }
                break;
            } catch (Exception e) { // this catches any errors that may be thrown
                dateview.invalidInput();
                continue;
            }
            // make sure that it cannot be more than year in advance

        }while (true);


        return  inp;
    }

}
