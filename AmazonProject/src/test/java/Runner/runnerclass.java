package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import jxl.read.biff.BiffException;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utilities.webconnector;


//running the project from runner class

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber"},
        features ="src/test/resource/",
        strict=true,
        monochrome= true,
        glue = {"StepDefinitions"}
)

public class runnerclass {

	@BeforeClass
	public static void startup() throws BiffException, IOException {
		webconnector.intialise();
	}
	
	@AfterClass
	public static void closedown() {
		webconnector.quitbrowser();
	}
}
