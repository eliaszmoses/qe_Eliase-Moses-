package starter.helper;

public class SelectproductTestSuite {

import net.serenitybdd.cucumber.suiteslicing.SerenitySplitSuite;
import net.serenitybdd.cucumber.suiteslicing.SerenitySlicer;
import net.serenitybdd.cucumber.suiteslicing.Slicer;
import org.junit.runner.RunWith

    @RunWith(SerenitySplitSuite.class)
    @SerenitySlicer(filter = "tags '@pilihproduk'")
    @Slicer(threads = "2:2")
    public class ProductSelectionTestSuite {}

}
