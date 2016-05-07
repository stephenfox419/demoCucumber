$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bbc_weather_for_preston.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the weather",
  "description": "So that we can know what the weather forecast is\r\nAs an internet user\r\nI want to enter my postcode and see the weather displayed",
  "id": "checking-the-weather",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4368720722,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Get answers based on played numbers",
  "description": "",
  "id": "checking-the-weather;get-answers-based-on-played-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am logged on the bbc weather portal",
  "keyword": "Given "
});
formatter.match({
  "location": "BbcWeatherForPrestonStepsTest.I_am_logged_on_the_bbc_weather_portal()"
});
formatter.result({
  "duration": 1569344592,
  "status": "passed"
});
formatter.step({
  "line": 8,
  "name": "I enter my postcode",
  "keyword": "When "
});
formatter.match({
  "location": "BbcWeatherForPrestonStepsTest.I_enter_my_postcode()"
});
});