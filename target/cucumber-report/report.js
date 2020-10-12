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
  "duration": 56371379357,
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
  "duration": 143549485355,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.degree.pages.SearchPage.setForm(SearchPage.java:98)\r\n\tat com.degree.trainlineapp.search.SearchTickets.i_enter_into_the_From_field(SearchTickets.java:46)\r\n\tat ✽.When I enter \"Manchester Airport\" into the From field(com/degree/trainlineapp/search/searchtrains.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "SearchTickets.i_select_Return_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchTickets.i_enter_today_s_date_into_OUT_date_field()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "SearchTickets.i_enter_departure_and_arival_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchTickets.i_select_railcards()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchTickets.i_should_redirected_to_trainline_booking_results()"
});
formatter.result({
  "status": "skipped"
});
});