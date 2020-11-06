package org.cheapair.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.cheapair.logic"},tags= {"@Cheap"},monochrome=true)
public class ChearAirRunner {

}
