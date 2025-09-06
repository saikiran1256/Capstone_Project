Feature:Search Future
Scenario Outline:search feature
Given open home page in default browser
When go to <search> and add text and search
Then close driver
Examples:
|search|
|Apple|
|Google|
|Samsung|