package com.bobwares.cucumber.stepdefs;

import com.bobwares.BatchHipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BatchHipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
