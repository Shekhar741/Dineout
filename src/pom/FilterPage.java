package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {

	@FindBy(xpath = "//div[@id='location']//div[@class='checkbox']//label") // Filter
	// by
	// location
	private List<WebElement> location;

	@FindBy(xpath = "//div[@id='cuisine']//div[@class='checkbox']//label") // Filter
	// by
	// Cuisines
	private List<WebElement> cuisine;

	@FindBy(xpath = "//div[@id='price_range']//div[@class='checkbox']//label") // Filter
	// by
	// Cost
	// for
	// 2
	private List<WebElement> cost;

	@FindBy(xpath = "//div[@id='feature']//div[@class='checkbox']//label") // Filter
	// by
	// feature
	private List<WebElement> feature;

	@FindBy(xpath = "//div[@id='tag']//div[@class='checkbox']//label") // Filter
	// by
	// star
	private List<WebElement> star;

public FilterPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

	// Click Location Checkbox
	public void clickLocationCheckbox(String[] location_chk) throws InterruptedException {
		for (WebElement loc : location) {
			for (String l : location_chk) {
				if (loc.getText().equals(l)) {
					loc.click();
					Thread.sleep(2000);
				}
			}
		}
	}

	// Click on Cuisines checkbox
	public void clickCuisinesCheckbox(String[] cuisines_chk) throws InterruptedException {
		for (WebElement cuisine_chkbox : cuisine) {
			for (String c : cuisines_chk) {
				if (cuisine_chkbox.getText().equals(c)) {
					cuisine_chkbox.click();
					Thread.sleep(2000);
				}
			}
		}
	}

	// Click on Cost for two
	public void clickCostCheckbox(String[] cost_chk) throws InterruptedException {
		for (WebElement cost_chkbox : cost) {
			for (String cst : cost_chk) {
				if (cost_chkbox.getText().equals(cst)) {
					cost_chkbox.click();
					Thread.sleep(2000);
				}
			}
		}
	}

	// Click on feature
	public void clickFeatureCheckbox(String[] feature_chk) throws InterruptedException {
		for (WebElement feature_chkbox : feature) {
			for (String feat : feature_chk) {
				if (feature_chkbox.getText().equals(feat)) {
					feature_chkbox.click();
					Thread.sleep(2000);
				}
			}
		}
	}

	// Click on Star
	public void clickStarCheckbox(String[] star_chk) throws InterruptedException {
		for (WebElement star_chkbox : star) {
			for (String st : star_chk) {
				if (star_chkbox.getText().equals(st)) {
					star_chkbox.click();
					Thread.sleep(2000);
				}
			}
		}
	}

}
