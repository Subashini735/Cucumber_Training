$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Scenario_Datatable/Log3.feature");
formatter.feature({
  "name": "Create Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to create an account",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Def3.i_want_to_create_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my data",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "Megna",
        "abbbsd123"
      ]
    },
    {
      "cells": [
        "Pravena",
        "hhsf124"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step_Def3.i_enter_my_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the account",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def3.verify_the_account()"
});
formatter.result({
  "status": "passed"
});
});