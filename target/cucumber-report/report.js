$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/degree/trainlineapp/search/searchtrains.feature");
formatter.feature({
  "line": 2,
  "name": "Navigate to thetrainline website and search trains details for booking.Fill in all the fields in search criteria.",
  "description": "",
  "id": "navigate-to-thetrainline-website-and-search-trains-details-for-booking.fill-in-all-the-fields-in-search-criteria.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "that I navigates to \"www.thetrainline.com\" website in Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "www.thetrainline.com",
      "offset": 21
    }
  ],
  "location": "SearchTickets.that_I_navigates_to_website_in_Chrome_browser(String)"
});
formatter.result({
  "duration": 42698690638,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "To search the trains booking details",
  "description": "",
  "id": "navigate-to-thetrainline-website-and-search-trains-details-for-booking.fill-in-all-the-fields-in-search-criteria.;to-search-the-trains-booking-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I enter \"Manchester Airport\" into the From field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter \"London Bridge\" into the To field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select Return option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter today\u0027s date into OUT date field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter RETURN date of 3 days later from today’s date",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter departure and arival time",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select railcards",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should redirected to trainline booking results after submitting details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Manchester Airport",
      "offset": 9
    }
  ],
  "location": "SearchTickets.i_enter_into_the_From_field(String)"
});
formatter.result({
  "duration": 25708275365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London Bridge",
      "offset": 9
    }
  ],
  "location": "SearchTickets.i_enter_into_the_To_field(String)"
});
formatter.result({
  "duration": 6220986959,
  "status": "passed"
});
formatter.match({
  "location": "SearchTickets.i_select_Return_option()"
});
formatter.result({
  "duration": 875819348,
  "status": "passed"
});
formatter.match({
  "location": "SearchTickets.i_enter_today_s_date_into_OUT_date_field()"
});
formatter.result({
  "duration": 9505992593,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "SearchTickets.i_enter_RETURN_date_of_days_later_from_today_s_date(int)"
});
formatter.result({
  "duration": 10498161170,
  "status": "passed"
});
formatter.match({
  "location": "SearchTickets.i_enter_departure_and_arival_time()"
});
formatter.result({
  "duration": 7002477432,
  "status": "passed"
});
formatter.match({
  "location": "SearchTickets.i_select_railcards()"
});
formatter.result({
  "duration": 6561089090,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton aria-haspopup\u003d\"false\" type\u003d\"button\" class\u003d\"_1151shj8\" data-test\u003d\"add-railcard\"\u003e...\u003c/button\u003e is not clickable at point (194, 601). Other element would receive the click: \u003cdiv class\u003d\"cookies-policy-banner-container cookies-policy-banner-enter-done\" data-test\u003d\"cookie-policy-banner\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DELL\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Komit\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64144}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2744e96c27b665cebae6d62fcafe1c00\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.degree.pages.SearchPage.setRailcards(SearchPage.java:236)\r\n\tat com.degree.trainlineapp.search.SearchTickets.i_select_railcards(SearchTickets.java:93)\r\n\tat ✽.And I select railcards(com/degree/trainlineapp/search/searchtrains.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchTickets.i_should_redirected_to_trainline_booking_results()"
});
formatter.result({
  "status": "skipped"
});
});