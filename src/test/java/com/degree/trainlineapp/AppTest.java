package com.degree.trainlineapp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="html:target/cucumber-report")
public class AppTest {

}