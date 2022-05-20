package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestDate;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        resultPage=new ResultPage();


    }
    @Test(dataProvider="jobsearch",dataProviderClass = TestDate.class,groups = {"sanity","smoke","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {
        homePage.clickonjobtitle(jobTitle);
        homePage.hanldingIframe();

        homePage.sendtextonlocation(location);
        homePage.eneterdistance(distance);
        Thread.sleep(2000);
        homePage.clickonmoreoprinon();
        homePage.enterminmunsalary(salaryMin);
        homePage.entermaximunsalary(salaryMax);
        homePage.salarytype(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults(result);




    }

}
