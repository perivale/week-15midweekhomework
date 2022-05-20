package resources.testdata;

import org.testng.annotations.DataProvider;
import sun.security.util.Password;

public class TestDate {
    @DataProvider(name = "jobsearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"tester","harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Automation Tester", "Sheffield", "up to 5 miles", "20000", "40000", "Per annum", "Permanent", "Permanent Automation Tester jobs in Sheffield"},
                {"manager", "Nottinghamshire", "up to 15 miles", "40000", "45000", "Per annum", "Part Time", "Part Time Manager jobs in Nottinghamshire"},
                {"nurse", "derby", "up to 10 miles", "2200", "3500", "Per month", "Contract", "Contract Nurse jobs in Derby"},
                {"Cleaner", "london", "up to 5 miles", "100", "200", "Per day", "Part Time", "Part Time Cleaner jobs in London"}


        };

        return data;


    }
}
