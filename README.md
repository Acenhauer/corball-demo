# corball-demo
Corball demo - The test automation demo

# WebDriver Demo
You can execute an automated google search using the following command:

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://127.0.0.1:4444/wd/hub test

http://selgp:8b819d9d-0298-4f8f-9430-6d44e87ac7b5@ondemand.saucelabs.com:80/wd/hub

Corball supports Saucelabs, you can trigger your changing the Hub url

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

Corball supports Internet Explorer, Firefox, Opera, Safari and Chrome.


