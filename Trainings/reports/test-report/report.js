$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Demo.feature');
formatter.feature({
  "line": 2,
  "name": "Verifying the cucumber functionalities",
  "description": "",
  "id": "verifying-the-cucumber-functionalities",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EntireFeature"
    }
  ]
});
formatter.scenario({
  "line": 47,
  "name": "working with upload popup",
  "description": "",
  "id": "verifying-the-cucumber-functionalities;working-with-upload-popup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@fileupload"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "the browser and url",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "we click on browse button and upload file",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.the_browser_and_url()"
});
formatter.result({
  "duration": 16302479700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.we_click_on_browse_button_and_upload_file()"
});
formatter.result({
  "duration": 20785115000,
  "status": "passed"
});
});