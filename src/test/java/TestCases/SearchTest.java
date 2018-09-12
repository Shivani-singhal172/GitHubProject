package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.GitHub.Util.BaseClass;

public class SearchTest extends BaseClass {

	@FindBy(xpath = "//input[@name='q']")
	WebElement SearchGitHub;

	@FindBy(xpath = "//div/a/span[contains(text(),'203')]")
	WebElement RepoCount;

	@FindBy(xpath = "//a[@class='v-align-middle' and contains(text(),'capitalone/')]")
	WebElement capitalone_Hygieia;

	@FindBy(xpath ="//h1[@class='public ']")
	WebElement PageValidatecapitalone_Hygieia;
	
	@FindBy(xpath = "//ul[@class='numbers-summary']/li[1]")
	WebElement CommitHeader;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[2]")
	WebElement BranchesHeader;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[3]")
	WebElement ReleasesHeader;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[4]")
	WebElement ContributorsHeader;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[1]/a/span")
	WebElement Commitcount;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[2]/a/span")
	WebElement BranchesCount;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[3]/a/span")
	WebElement ReleasesCount;

	@FindBy(xpath = "//ul[@class='numbers-summary']/li[4]/a/span")
	WebElement ConttributorsCount;

	
	//PageFactory Initialization
	public SearchTest(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	//enter the data in searchtext box
	public void SearchTextinGitHub() {
		SearchGitHub.sendKeys("hygieia");
		SearchGitHub.sendKeys(Keys.ENTER);
		Assert.assertTrue(capitalone_Hygieia.isDisplayed(),
				capitalone_Hygieia + "is not present on the page displayed");
	}

	//Verify the repository count is greater than 3 
	public void ValidateRepoCount() {
		String count = RepoCount.getText();
		int integer = Integer.parseInt(count);
		Boolean flag = false;
		if (integer >= 3) {
			Assert.assertTrue(RepoCount.isDisplayed(), "The repo count is greater than 3");
			flag = true;
		}
	}
	
	//Click on captilone link 
	public void ClickOnCapitalone(){
		capitalone_Hygieia.click();
		Assert.assertTrue(PageValidatecapitalone_Hygieia.isDisplayed(), "The user is on the Captilone_hygieia page");
	}

	//verfiy in captilone repository all the headers are present
	public void ValidateHeaders(){
		Assert.assertTrue(CommitHeader.isDisplayed(), "commitheader is not present" );
		Assert.assertTrue(BranchesHeader.isDisplayed(), "Branchheader is not present" );
		Assert.assertTrue(ReleasesHeader.isDisplayed(), "releaseheader is not present" );
		Assert.assertTrue(ContributorsHeader.isDisplayed(), "Contributorheader is not present" );
	
	}
	
	//verify the count of all the headers
	public void validateCountOfHeader(){
		String CommitCount1 = Commitcount.getText();
		String BranchesCount1 = BranchesCount.getText();
		String ReleasesCount1 = ReleasesCount.getText();
	    String ConttributorsCount1 = ConttributorsCount.getText();
		int commitcountnumber = Integer.parseInt(CommitCount1);
		int branchcountnumber = Integer.parseInt(BranchesCount1);
		int releasescountnumber = Integer.parseInt(ReleasesCount1);
		int contributorcountnumber = Integer.parseInt(ConttributorsCount1);
		if(commitcountnumber>2000){
			Assert.assertTrue(true , "The commit count is not greater than 2000");
			
		}
		
	if(branchcountnumber>4){
		Assert.assertTrue(true , "The branch count is not greater than 4");
	}
		
	if(releasescountnumber>=8){
		Assert.assertTrue(true , "The Release count is not greater than 8");
	}
		if(contributorcountnumber>50){
			Assert.assertTrue(true , "The contributor count is not greater than 50");
		}
	}


}

